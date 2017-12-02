package com.dao;

import com.bean.U_to_p_message;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface U_to_p_messageMapper {

//    int deleteByPrimaryKey(Long photographerMessageId);
//
//    int insert(U_to_p_message record);
//
//    int insertSelective(U_to_p_message record);

//    List<U_to_p_message> selectByExample(U_to_p_messageExample example);
    //1.通过摄影师ID获取到用户留言信息
    public List<U_to_p_message> selectByPhotographerId(Long photographerId);

//    U_to_p_message selectByPrimaryKey(Long photographerMessageId);
//
//    int updateByPrimaryKeySelective(U_to_p_message record);
//
//    int updateByPrimaryKey(U_to_p_message record);
}