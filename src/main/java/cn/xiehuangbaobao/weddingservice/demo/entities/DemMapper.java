package cn.xiehuangbaobao.weddingservice.demo.entities;

import cn.xiehuangbaobao.weddingservice.demo.entities.Dem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dem
     *
     * @mbggenerated
     */
    int insert(Dem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dem
     *
     * @mbggenerated
     */
    List<Dem> selectAll();
}