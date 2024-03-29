package cn.xiehuangbaobao.weddingservice.invitation.dao;

import cn.xiehuangbaobao.weddingservice.WeddingserviceApplicationTests;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Arrays;

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
        GuestExample example = new GuestExample();
        example.createCriteria().andIdIn(Arrays.asList(1000,1001));
        List<Guest> result = invitationDao.getGuestBycondition(example);
        System.out.println(JSON.toJSONString(result));
    }

    @Test
    public void insertComment(){
        Comment comment = new Comment();
        comment.setId(1);
        comment.setGuestId(1000);
        comment.setComment("你好");
        invitationDao.insertComment(comment);
    }

    @Test
    public void getAllComment(){
        CommentExample example = new CommentExample();
        example.createCriteria().andGuestIdIsNotNull();
        List<Comment> comments = invitationDao.getByCommentCondition(example);
        System.out.println(JSON.toJSONString(comments));
    }

    @Test
    public void updateByExampleSelective(){
        Guest guest = JSON.parseObject("{\n" +
                "\t\"name\":\"xcx\",\n" +
                "\t\"wechatName\":\"xcx wechat\",\n" +
                "\t\"wechatId\": \"xcx wechat id\",\n" +
                "\t\"attend\":\"FUMANLOU 1\"\n" +
                "}",Guest.class);

        GuestExample example = new GuestExample();
        example.createCriteria().of(guest);

        invitationDao.updateByExampleSelective(guest,example);

    }
}