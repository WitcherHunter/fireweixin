//package com.yeejoin.util
//
//import com.yeejoin.constants.Constants
//import groovy.lang.Singleton
//import org.json.JSONException
//import org.json.JSONObject
//import java.net.URL
//
///**
// * Created by zhou on 2017/3/11.
// *
// * 获取token，调用方法：AccessTokenTool.get().token
// */
//
//class AccessTokenTool private constructor(){
//    companion object{
//        fun get():AccessTokenTool{
//            return Inner.accessTokenToll
//        }
//    }
//
//    private object Inner{
//        val accessTokenToll = AccessTokenTool()
//    }
//
//    val url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=${Constants.APPID}" +
//            "&secret=${Constants.APP_SECRET}"
//
//    val expireTime = 7200 * 1000
//    var refreshTime: Long = 0
//
//    private var _token = ""
//    val token: String
//        get(){
//            if (_token.isBlank() || System.currentTimeMillis() - refreshTime > expireTime) {
//                _token = initAccessToken()
//                refreshTime = System.currentTimeMillis()
//            }
//            return _token
//        }
//
//    fun initAccessToken(): String{
//        var response = URL(url).readText()
//        var json = JSONObject(response)
//
//        try {
//            return json.getString("access_token")
//        } catch (e: JSONException) {
//            System.out.print("errcode : ${json.getString("errcode")}  errMsg : ${json.getString("errmsg")}")
//        }
//
//        return ""
//    }
//}