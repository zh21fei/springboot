package com.itcast.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class MyController {


    @RequestMapping("/test")
    public String test(){
        return "哈哈";
    }
}
