package cn.itcast;

import cn.itcast.domain.User;
import cn.itcast.repository.UserRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootSpringdatajpaApplication.class)
public class SpringbootSpringdatajpaApplicationTests {

    @Autowired
    private UserRepository userRepository;
    @Test
    public void contextLoads() {
        List<User> users = userRepository.findAll();
        System.out.println(users);
        //[User{id=1, username='zhangsan', password='123', name='张三'}, User{id=2, username='lisi', password='123', name='李四'}]
    }
}
