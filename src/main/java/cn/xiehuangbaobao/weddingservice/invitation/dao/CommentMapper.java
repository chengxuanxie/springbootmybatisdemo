package cn.xiehuangbaobao.weddingservice.invitation.dao;

import cn.xiehuangbaobao.weddingservice.invitation.dao.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    int insert(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    List<Comment> selectAll();
}