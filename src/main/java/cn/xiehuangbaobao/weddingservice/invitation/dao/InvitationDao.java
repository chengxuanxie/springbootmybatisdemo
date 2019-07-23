package cn.xiehuangbaobao.weddingservice.invitation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InvitationDao {

    final Base64.Decoder decoder = Base64.getDecoder();
    final Base64.Encoder encoder = Base64.getEncoder();

    @Autowired
    private GuestMapper guestMapper;

    @Autowired
    private CommentMapper commentMapper;

    public void insertGuest(Guest guest){
        guestMapper.insert(guest);
    }

    public List<Guest> getGuestBycondition(GuestExample guestExample){
        return guestMapper.selectByExample(guestExample);
    }

    public void insertComment(Comment comment){
        String text = comment.getComment();
        try {
            comment.setComment(encoder.encodeToString(text.getBytes("UTF-8")));
        }
        catch (Exception e){

        }
        commentMapper.insert(comment);
    }

    public List<Comment> getByCommentCondition(CommentExample example){
        return commentMapper.selectByExampleWithBLOBs(example).stream()
                .map(comment -> {
                    try {
                        comment.setComment(new String(decoder.decode(comment.getComment()), "UTF-8"));
                    }catch (Exception e){

                    }
                    return comment;
                }).collect(Collectors.toList());
    }

    public void updateByExampleSelective(Guest guest, GuestExample example){
        guestMapper.updateByExampleSelective(guest, example);
    }
}
