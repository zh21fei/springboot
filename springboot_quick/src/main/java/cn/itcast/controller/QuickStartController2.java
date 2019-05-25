package cn.itcast.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/quick2")
@ConfigurationProperties(prefix = "student")
public class QuickStartController2 {
    private String name;
    private String gender;
    private Integer age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String quick(){
        return "springboot 访问成功 ，name="+name+"，gender="+gender+"，personage="+age;
        //springboot 访问成功 ，name=tom，gender=男，personage=29
    }
}
