package cn.xiehuangbaobao.weddingservice.demo.controller;

import cn.xiehuangbaobao.weddingservice.demo.service.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private UserService userService;

    @RequestMapping("/demo")
    public String demo(){
        System.out.println("TestController的方法被调用了");
        return JSON.toJSONString(userService.selectAll());
    }
}
