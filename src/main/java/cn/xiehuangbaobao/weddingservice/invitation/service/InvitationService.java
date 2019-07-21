package cn.xiehuangbaobao.weddingservice.invitation.service;

import cn.xiehuangbaobao.weddingservice.invitation.dao.*;
import cn.xiehuangbaobao.weddingservice.invitation.domain.CommentReq;
import cn.xiehuangbaobao.weddingservice.invitation.domain.CommonRsp;
import cn.xiehuangbaobao.weddingservice.invitation.domain.GuestReq;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InvitationService {

    @Autowired
    private InvitationDao invitationDao;

    @PutMapping("/rest/comment")
    public CommonRsp saveComment(@RequestBody CommentReq req){
        CommonRsp commonRsp = new CommonRsp();

        GuestExample guestExample = new GuestExample();

        guestExample.createCriteria().andIdEqualTo(req.getGuestId());

        List<Guest> guestList = invitationDao.getGuestBycondition(guestExample);

        if(CollectionUtils.isEmpty(guestList)){
            commonRsp.setRetCode("-1");
            commonRsp.setRetMsg("guest Not exist");
            return commonRsp;
        }

        Comment comment = new Comment();
        comment.setGuestId(req.getGuestId());
        comment.setComment(req.getComment());
        invitationDao.insertComment(comment);

        commonRsp.setRetCode("1");
        commonRsp.setRetMsg("success");
        return commonRsp;
    }

    @GetMapping("/rest/comment")
    public List<Comment> getComment(@RequestParam(required=false) Integer guestId){
        CommentExample example = new CommentExample();
        if(null != guestId) {
            example.createCriteria().andGuestIdEqualTo(guestId);
        }
        List<Comment> result = invitationDao.getByCommentCondition(example);
        return result;
    }

    @PutMapping("/rest/guest")
    public CommonRsp saveGuest(@RequestBody GuestReq guestReq){
        CommonRsp commonRsp = new CommonRsp();
        Guest guest = new Guest();
        BeanUtils.copyProperties(guestReq,guest);
        GuestExample example = new GuestExample();
        example.createCriteria().of(guest);
        List<Guest> oldGuests = invitationDao.getGuestBycondition(example);
        if(CollectionUtils.isEmpty(oldGuests)){
            invitationDao.insertGuest(guest);
            commonRsp.setRetCode("0");
            commonRsp.setRetMsg("create success!");
        }else if(oldGuests.size() == 1){
            invitationDao.updateByExampleSelective(guest, example);
            commonRsp.setRetCode("0");
            commonRsp.setRetMsg("update success!");
        }
        else {
            commonRsp.setRetCode("-1");
            commonRsp.setRetMsg("duplicate guest found");
            return commonRsp;
        }

        return commonRsp;

    }

    @GetMapping("/rest/weixin")
    public String valideWexin(@RequestParam String signature, @RequestParam String timestamp,
                              @RequestParam String nonce,@RequestParam String echostr){
        System.out.println(echostr);
        return echostr;
    }

}
