package cn.itcast.controller;


import cn.itcast.domain.User;
import cn.itcast.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mybatis")
public class MapperController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/queryUser")
    public List<User> queryUserList(){
        List<User> users = userMapper.queryUserList();
        return users;
        //页面[{"id":1,"username":"zhangsan","password":"123","name":"张三"},{"id":2,"username":"lisi","password":"123","name":"李四"}]
    }
}
