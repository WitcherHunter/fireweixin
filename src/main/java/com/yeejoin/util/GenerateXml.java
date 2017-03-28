package com.yeejoin.util;


import com.yeejoin.bean.*;
import com.yeejoin.constants.Constants;
import com.yeejoin.http.API;
import com.yeejoin.http.RetrofitFactory;
import com.yeejoin.xml.TextMessageEntity;
import org.dom4j.Document;
import org.dom4j.Element;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 * Created by zhou on 2017/3/27.
 */
public class GenerateXml {
    public static String generateTextXml(String toUserName, String fromUserName, String content) throws JAXBException, IOException {
        TextMessageEntity entity = new TextMessageEntity();
        entity.setToUserName(fromUserName);
        entity.setFromUserName(toUserName);
        entity.setCreateTime((int) (System.currentTimeMillis() / 1000));
        entity.setMsgType("text");
        entity.setContent(content);

        String[] list = new String[]{"^ToUserName", "^FromUserName", "^MsgType", "^Content"};

        return XmlHelper.objectToXmlWithCDATA(entity, list, TextMessageEntity.class);
    }

    public static String handleScanResult(Document document) throws IOException, JAXBException {
        Element root = document.getRootElement();
        String toUser = root.element("ToUserName").getStringValue();
        String fromUser = root.element("FromUserName").getStringValue();
        String code = root.element("ScanCodeInfo").element("ScanResult").getStringValue();
        String code1 = SplitScanCodeUtil.isRfid(code);
        EquipResponse response = RetrofitFactory.getInstance().getEquip(code1).execute().body();

        String value;

        if (null != response && null != response.getData())
            value = mapEquip(response.getData().get(0), code1);
        else
            value = "没有此装备";

        return GenerateXml.generateTextXml(toUser, fromUser, value);
    }

    public static void handleNotificationEvent() {
        String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=" +
                Constants.APPID + "&secret=" + Constants.APP_SECRET;
        String token = getAccessToken(url);
        String mediaId = getMaterial(token);

        API service = new Retrofit.Builder()
                .baseUrl("https://api.weixin.qq.com/cgi-bin/message/mass/")
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(API.class);

        NotificationRequest request = new NotificationRequest();
        NotificationRequest.FilterBean filter = new NotificationRequest.FilterBean();
        NotificationRequest.MpnewsBean mpnews = new NotificationRequest.MpnewsBean();
        filter.setIs_to_all(false);
        filter.setGroup_id("100");
        mpnews.setMedia_id(mediaId);
        request.setMsgtype("mpnews");

        try {
            service.sendNotification(token, request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getAccessToken(String url) {
        API service = new Retrofit.Builder()
                .baseUrl(url)
                .build()
                .create(API.class);
        try {
            String response = service.getAccessToken().execute().body();
            JSONObject json = new JSONObject(response);
            if (json.getString("access_token") != null)
                return json.getString("access_token");
            else
                return "";
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static String getMaterial(String token) {
        API service = new Retrofit.Builder()
                .baseUrl("https://api.weixin.qq.com/cgi-bin/material/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(API.class);

        try {
            Response<MaterialResponse> response = service.getMaterial(token, new MaterialRequest("news", 0, 10)).execute();
            if (response.isSuccessful())
                return response.body().getItem().get(0).getMedia_id();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    public static String mapEquip(EquipModel model, String code) {
        String url;
        if (model.getEquipVideo() == null || model.getEquipVideo().isEmpty())
            url = "<a>点击查看演示视频</a>";
        else
            url = "<a href=\"" + model.getEquipVideo() + "\">点击查看演示视频</a>";

        String count = (model.getCount() == null || model.getCount().isEmpty()) ? "20个" : model.getCount();
        String maintenanceDate = (model.getMaintenanceDate() == null || model.getMaintenanceDate().isEmpty()) ? "2016-12-01" : model.getMaintenanceDate();
        String maintenanceNextDate = (model.getMaintenanceNextDate() == null || model.getMaintenanceNextDate().isEmpty()) ? "2017-12-01" : model.getMaintenanceNextDate();
        String indate = (model.getInDate() == null || model.getInDate().isEmpty())? "2015-02-02" : model.getInDate();

        return "名称:" + model.getEquipname()
                + "\n数量:" + count
                + "\n已保养时间:" + maintenanceDate
                + "\n需保养时间:" + maintenanceNextDate
                + "\n入库时间:" + indate
                + "\n装备编码:" + model.getEquipCode()
                + "\n分类名称:" + model.getTypeName()
                + "\n分类编码:" + model.getTypeCode()
                + "\n所属机构:" + model.getOrgName()
                + "\n仓库名称:" + model.getStoreName()
                + "\nRFID:" + code
                + "\n" + url;
    }

}
