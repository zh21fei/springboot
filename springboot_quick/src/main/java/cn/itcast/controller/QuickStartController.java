package cn.itcast.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/quick")
public class QuickStartController {

    @Value("${name}")
    private String name;

    @Value("${person.name}")
    private String personname;

    @Value("${person.age}")
    private Integer age;

    @RequestMapping("/hello")
    @ResponseBody
    public String quick(){
        return "springboot 访问成功 ，name="+name+"，personname="+personname+"，personage="+age;
        //springboot 访问成功 ，name=柳传志，personname=tom，personage=10
    }
}
