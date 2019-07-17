package cn.xiehuangbaobao.weddingservice.invitation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvitationDao {

    @Autowired
    private GuestMapper guestMapper;

    @Autowired
    private CommentMapper commentMapper;

    public void insertGuest(Guest guest){
        guestMapper.insert(guest);
    }

    public List<Guest> getAllGuest(GuestExample guestExample){
        return guestMapper.selectByExample(guestExample);
    }

    public void insertComment(Comment comment){
        commentMapper.insert(comment);
    }

    public List<Comment> getByCondition(CommentExample example){
        return commentMapper.selectByExample(example);
    }
}
