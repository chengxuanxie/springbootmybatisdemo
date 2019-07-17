package cn.xiehuangbaobao.weddingservice.invitation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvitationDao {

    @Autowired
    private GuestMapper guestMapper;

    public void insertGuest(Guest guest){
        guestMapper.insert(guest);
    }

    public List<Guest> getAllGuest(){
        return guestMapper.selectAll();
    }
}
