package cn.xiehuangbaobao.weddingservice.invitation.domain;

import lombok.Data;

@Data
public class GuestReq {

    private String name;


    private String wechatName;


    private String wechatId;


    private String attend;

    private String extendParm;
}
