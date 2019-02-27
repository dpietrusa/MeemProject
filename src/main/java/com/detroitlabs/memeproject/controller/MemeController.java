package com.detroitlabs.memeproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemeController {

    @RequestMapping("/")
    @ResponseBody
    public String sayHello(){
        return "Hey guys";
    }
}
