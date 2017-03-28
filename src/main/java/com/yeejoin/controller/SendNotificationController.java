package com.yeejoin.controller;

import com.yeejoin.util.GenerateXml;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhou on 2017/3/21.
 */
@RestController
public class SendNotificationController {

        @RequestMapping(value = "/fireweixin/notification",method = RequestMethod.GET)
        public String sendNotification(@RequestBody(required = false) String request){
            GenerateXml.handleNotificationEvent();
            return "success";
        }
}
