package com.yeejoin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhou on 2017/3/11.
 */

@RestController
public class HelloController {

    @RequestMapping(value = "/fireweixin/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello spring boot";
    }
}
