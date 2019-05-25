package cn.itcast;


import cn.itcast.domain.User;
import cn.itcast.repository.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringbootSpringdatajpaApplication.class)
public class RedisTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Test
    public void test01()throws Exception{

        //1.从Redis中获取缓存数据，数据的形式json
        String userListJson = redisTemplate.boundValueOps("user.findAll").get();
        //2.判断Redis中是否存在缓存数据
        if (userListJson==null){
            //3.不存在，从数据库获取查询
            List<User> all = userRepository.findAll();
            //4.将查询的数据存储到Redis缓存中
            //将list集合装换为json数据格式的字符串 ，使用jackson进行转换
            ObjectMapper objectMapper = new ObjectMapper();
            userListJson = objectMapper.writeValueAsString(all);
            redisTemplate.boundValueOps("user.findAll").set(userListJson);
            System.out.println("从数据库获得数据");
        }else {
            System.out.println("从Redis缓存中获取数据");
        }
        System.out.println(userListJson);
    }
}
