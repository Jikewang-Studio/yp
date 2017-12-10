package com.dao;

import com.bean.Attention;
import com.bean.AttentionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AttentionMapper {
    Integer countByExample(AttentionExample example);

    int deleteByExample(AttentionExample example);

    int deleteByPrimaryKey(Integer attentionId);

    int insert(Attention record);
    //1用户通过userId，photographerId来添加关注
    public int  addAttention(@Param("userId")Integer userId,@Param("photographerId")Integer photographerId);

    int insertSelective(Attention record);

    List<Attention> selectByExample(AttentionExample example);

    Attention selectByPrimaryKey(Integer attentionId);

    int updateByExampleSelective(@Param("record") Attention record, @Param("example") AttentionExample example);

    int updateByExample(@Param("record") Attention record, @Param("example") AttentionExample example);

    int updateByPrimaryKeySelective(Attention record);

    int updateByPrimaryKey(Attention record);
}