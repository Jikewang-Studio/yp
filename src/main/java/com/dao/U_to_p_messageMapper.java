package com.dao;

import com.bean.U_to_p_message;
import com.bean.U_to_p_messageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface U_to_p_messageMapper {
    long countByExample(U_to_p_messageExample example);

    int deleteByExample(U_to_p_messageExample example);

    int deleteByPrimaryKey(Long photographerMessageId);

    int insert(U_to_p_message record);

    int insertSelective(U_to_p_message record);

    List<U_to_p_message> selectByExample(U_to_p_messageExample example);
    //1.根据摄影师ID,查询到用户给其的留言
    List<U_to_p_message> selectByPhotographerId(Long photographerId);

    U_to_p_message selectByPrimaryKey(Long photographerMessageId);

    int updateByExampleSelective(@Param("record") U_to_p_message record, @Param("example") U_to_p_messageExample example);

    int updateByExample(@Param("record") U_to_p_message record, @Param("example") U_to_p_messageExample example);

    int updateByPrimaryKeySelective(U_to_p_message record);

    int updateByPrimaryKey(U_to_p_message record);
}