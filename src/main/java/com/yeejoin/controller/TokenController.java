package com.yeejoin.controller;

import com.yeejoin.constants.Constants;
import com.yeejoin.util.GenerateXml;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhou on 2017/3/21.
 */
@RestController
public class TokenController {

    @RequestMapping(value = "/fireweixin/getToken",method = {RequestMethod.GET,RequestMethod.POST})
    public String getToken(){
        return GenerateXml.getAccessToken("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=" +
                Constants.APPID + "&secret=" + Constants.APP_SECRET);
    }
}
