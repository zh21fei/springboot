package cn.itcast.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //
public class QuickStarController {

    @RequestMapping("/quick2")
    public String quick(){
        return "hello springboot...";
    }
}
