package com.yeejoin.controller;

import com.yeejoin.constants.MsgType;
import com.yeejoin.handler.HandleEventKt;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhou on 2017/3/20.
 */
@RestController
public class MessageController {
    private String toUser = "";
    private String fromUser = "";

    @RequestMapping(value = "/fireweixin/wechat",method = {RequestMethod.POST,RequestMethod.GET})
    public String receiveMessage(@RequestBody(required = false) String request) throws DocumentException {
        String response = "";

        if (request != null) {
            Document document = DocumentHelper.parseText(request);
            Element root = document.getRootElement();
            toUser = root.element("ToUserName").getStringValue();
            fromUser = root.element("FromUserName").getStringValue();

            String msgType = root.element("MsgType").getStringValue();
            if (msgType.equals(MsgType.EVENT.getValue()))
                response = HandleEventKt.handleScanResult(document);
            else if (msgType.equals(MsgType.TEXT.getValue())) {
//                response = GenerateXmlKt.generatePicTextXml(toUser, fromUser);
            }

            System.out.println(response);
        }
        return response;
    }
}
