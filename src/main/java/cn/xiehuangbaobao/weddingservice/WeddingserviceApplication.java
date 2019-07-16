package cn.xiehuangbaobao.weddingservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.xiehuangbaobao.weddingservice.demo.entities")
@SpringBootApplication
public class WeddingserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeddingserviceApplication.class, args);
    }

}
