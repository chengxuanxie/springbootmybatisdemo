package cn.xiehuangbaobao.weddingservice.invitation.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guest
     *
     * @mbggenerated
     */
    int insert(Guest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guest
     *
     * @mbggenerated
     */
    List<Guest> selectAll();
}