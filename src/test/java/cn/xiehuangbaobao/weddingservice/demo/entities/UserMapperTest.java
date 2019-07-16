package cn.xiehuangbaobao.weddingservice.demo.entities;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserMapperTest {
    @Autowired
    private DemMapper userMapper;

    @Test
    public void insert() {
        Dem dem = new Dem();
        dem.setId(1);
        dem.setName("laksdfasd");
        userMapper.insert(dem);
    }

    @Test
    public void selectAll() {
        System.out.println(userMapper);
        System.out.println(userMapper.selectAll());
    }
}