package com.dao;

import com.bean.Order_details;
import com.bean.Order_detailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Order_detailsMapper {
    Integer countByExample(Order_detailsExample example);

    int deleteByExample(Order_detailsExample example);

    int deleteByPrimaryKey(Integer orderDetailsId);

    int insert(Order_details record);

    int insertSelective(Order_details record);

    List<Order_details> selectByExample(Order_detailsExample example);

    Order_details selectByPrimaryKey(Integer orderDetailsId);

    int updateByExampleSelective(@Param("record") Order_details record, @Param("example") Order_detailsExample example);

    int updateByExample(@Param("record") Order_details record, @Param("example") Order_detailsExample example);

    int updateByPrimaryKeySelective(Order_details record);

    int updateByPrimaryKey(Order_details record);
}