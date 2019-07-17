package cn.xiehuangbaobao.weddingservice.invitation.dao;

import cn.xiehuangbaobao.weddingservice.WeddingserviceApplicationTests;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class InvitationDaoTest extends WeddingserviceApplicationTests {

    @Autowired
    private InvitationDao invitationDao;

    @Test
    public void insertGuest() {
        Guest guest = new Guest();
        guest.setId((int)Math.random());
        guest.setAttend("NOATTEND");
        guest.setName("xcx");
        invitationDao.insertGuest(guest);

    }

    @Test
    public void getAllGuest() {
        List<Guest> result = invitationDao.getAllGuest();
        System.out.println(JSON.toJSONString(result));
    }
}