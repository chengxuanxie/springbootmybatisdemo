package cn.xiehuangbaobao.weddingservice.invitation.service;

import cn.xiehuangbaobao.weddingservice.invitation.dao.*;
import cn.xiehuangbaobao.weddingservice.invitation.domain.CommentReq;
import cn.xiehuangbaobao.weddingservice.invitation.domain.CommonRsp;
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

        List<Guest> guestList = invitationDao.getAllGuest(guestExample);

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

}
