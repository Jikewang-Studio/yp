package com.dao;

import com.bean.P_to_u_message;
import com.bean.P_to_u_messageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface P_to_u_messageMapper {
    long countByExample(P_to_u_messageExample example);

    int deleteByExample(P_to_u_messageExample example);

    int insert(P_to_u_message record);

    int insertSelective(P_to_u_message record);

    List<P_to_u_message> selectByExample(P_to_u_messageExample example);

    int updateByExampleSelective(@Param("record") P_to_u_message record, @Param("example") P_to_u_messageExample example);

    int updateByExample(@Param("record") P_to_u_message record, @Param("example") P_to_u_messageExample example);
}