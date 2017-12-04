package com.dao;

import com.bean.P_to_u_message;
import com.bean.P_to_u_messageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface P_to_u_messageMapper {
    long countByExample(P_to_u_messageExample example);

    int deleteByExample(P_to_u_messageExample example);

    int deleteByPrimaryKey(Long userMessageId);

    int insert(P_to_u_message record);

    int insertSelective(P_to_u_message record);

    List<P_to_u_message> selectByExample(P_to_u_messageExample example);
    //1.用户根据自己Id，获取到摄影师回复的留言信息。
    List<P_to_u_message> selectByUserId(Long userId);

    P_to_u_message selectByPrimaryKey(Long userMessageId);

    int updateByExampleSelective(@Param("record") P_to_u_message record, @Param("example") P_to_u_messageExample example);

    int updateByExample(@Param("record") P_to_u_message record, @Param("example") P_to_u_messageExample example);

    int updateByPrimaryKeySelective(P_to_u_message record);

    int updateByPrimaryKey(P_to_u_message record);
}