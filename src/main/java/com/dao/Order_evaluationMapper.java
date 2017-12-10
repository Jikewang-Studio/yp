package com.dao;

import com.bean.Order_evaluation;
import com.bean.Order_evaluationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Order_evaluationMapper {
    Integer countByExample(Order_evaluationExample example);

    int deleteByExample(Order_evaluationExample example);

    int deleteByPrimaryKey(Integer orderEvaluationId);

    int insert(Order_evaluation record);

    int insertSelective(Order_evaluation record);

    List<Order_evaluation> selectByExample(Order_evaluationExample example);

    Order_evaluation selectByPrimaryKey(Integer orderEvaluationId);

    int updateByExampleSelective(@Param("record") Order_evaluation record, @Param("example") Order_evaluationExample example);

    int updateByExample(@Param("record") Order_evaluation record, @Param("example") Order_evaluationExample example);

    int updateByPrimaryKeySelective(Order_evaluation record);

    int updateByPrimaryKey(Order_evaluation record);
}