package cn.xiehuangbaobao.weddingservice.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/demo")
    public String demo(){
        System.out.println("TestController的方法被调用了");
        return "welcome to the new age !";
    }
}
