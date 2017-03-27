package com.yeejoin.handler

import com.yeejoin.bean.MaterialRequest
import com.yeejoin.bean.NotificationRequest
import com.yeejoin.constants.Constants
import com.yeejoin.http.API
import com.yeejoin.http.RetrofitFactory
import com.yeejoin.util.GenerateXml
import com.yeejoin.util.SplitScanCodeUtil.isRfid
import com.yeejoin.util.mapEquip
import org.dom4j.Document
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.URL

/**
 * Created by zhou on 2017/3/13.
 */

//inline fun splitScanCode(code : String) : String = if (code.length > 11) code.substring(11) else code

//处理扫一扫逻辑，构建xml消息
fun handleScanResult(document: Document) : String{


    val root = document.rootElement
    val toUser = root.element("ToUserName").stringValue
    val fromUser = root.element("FromUserName").stringValue
    var code : String = root.element("ScanCodeInfo").element("ScanResult").stringValue
    val code1 = isRfid(code)

    val response = RetrofitFactory.api.getEquip(code1).execute().body()

    return GenerateXml.generateTextXml(toUser,fromUser,if (null != response && null != response.data) mapEquip(response.data[0],code1) else "没有此装备")
}

//处理后台推送，向用户发送通知
fun handleNotificationEvent(){
    val url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=${Constants.APPID}" +
            "&secret=${Constants.APP_SECRET}"
    val token = getAccessToken(url)
    val mediaId = getMaterial(token)

    val service = Retrofit.Builder()
            .baseUrl("https://api.weixin.qq.com/cgi-bin/message/mass/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(API::class.java)

    var body = NotificationRequest()
    body.filter = NotificationRequest.FilterBean()
    body.mpnews = NotificationRequest.MpnewsBean()
    body.filter.isIs_to_all = false
    body.filter.group_id = "100"
    body.mpnews.media_id = mediaId
    body.msgtype = "mpnews"

    service.sendNotification(token,body).execute()
}

fun getAccessToken(url: String): String{
    var response = URL(url).readText()
    var json = JSONObject(response)

    try {
        return json.getString("access_token")
    } catch (e: JSONException) {
        System.out.print("errcode : ${json.getString("errcode")}  errMsg : ${json.getString("errmsg")}")
    }

    return ""
}

fun getMaterial(token : String) : String{
    val service = Retrofit.Builder()
            .baseUrl("https://api.weixin.qq.com/cgi-bin/material/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(API::class.java)

    val response = service.getMaterial(token, MaterialRequest("news",0,10)).execute()
    if (response.isSuccessful){
        return response.body().item[0].media_id
    }
    return ""
}