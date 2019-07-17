package cn.xiehuangbaobao.weddingservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@MapperScan("cn.xiehuangbaobao")
public class WeddingserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeddingserviceApplication.class, args);
    }

}
