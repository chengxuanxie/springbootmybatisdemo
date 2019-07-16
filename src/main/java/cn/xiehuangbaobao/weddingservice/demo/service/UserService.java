package cn.xiehuangbaobao.weddingservice.demo.service;

import cn.xiehuangbaobao.weddingservice.demo.entities.Dem;
import cn.xiehuangbaobao.weddingservice.demo.entities.DemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    DemMapper userMapper;

    public List<Dem> selectAll(){
        return userMapper.selectAll();
    }
}
