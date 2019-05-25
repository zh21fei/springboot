package cn.itcast;

import cn.itcast.domain.User;
import cn.itcast.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
//SpringRunner继承自SpringJUnit4ClassRunner，使用哪一个Spring提供的测试测试引擎都可以
@RunWith(SpringRunner.class)
//@SpringBootTest的属性指定的是引导类的字节码对象
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class SpringbootMybatisApplicationTests {


    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {

        List<User> users = userMapper.queryUserList();
        System.out.println(users);
        //[User{id=1, username='zhangsan', password='123', name='张三'}, User{id=2, username='lisi', password='123', name='李四'}]
    }
}
