package com.dao;

import com.bean.Attention;
import com.bean.AttentionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttentionMapper {
    long countByExample(AttentionExample example);

    int deleteByExample(AttentionExample example);

    int insert(Attention record);

    int insertSelective(Attention record);

    List<Attention> selectByExample(AttentionExample example);

    int updateByExampleSelective(@Param("record") Attention record, @Param("example") AttentionExample example);

    int updateByExample(@Param("record") Attention record, @Param("example") AttentionExample example);
}