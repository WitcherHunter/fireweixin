package com.yeejoin.util;

import com.yeejoin.bean.EquipResponse;
import com.yeejoin.http.RetrofitFactory;
import com.yeejoin.xml.TextMessageEntity;
import org.dom4j.Document;
import org.dom4j.Element;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.ArrayList;

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

        return XmlHelper.objectToXmlWithCDATA(entity,list,TextMessageEntity.class);
    }

//    public static String handleScanResult(Document document) throws IOException {
//        Element root = document.getRootElement();
//        String toUser = root.element("ToUserName").getStringValue();
//        String fromUser = root.element("FromUserName").getStringValue();
//        String code = root.element("ScanCodeInfo").element("ScanResult").getStringValue();
//        String code1 = SplitScanCodeUtil.isRfid(code);
//        EquipResponse res = RetrofitFactory.Companion.getApi().getEquip(code1).execute().body();
//
//        return GenerateXml.generateTextXml(toUser,fromUser,)
//    }
}
