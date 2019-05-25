package cn.itcast;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//标注该类是springboot的启动类
public class MySpringBootApplication {
    public static void main(String[] args) {
        //代表运行springboot的启动类，参数为springboot启动类的字节码对象
        SpringApplication.run(MySpringBootApplication.class);
    }
}
