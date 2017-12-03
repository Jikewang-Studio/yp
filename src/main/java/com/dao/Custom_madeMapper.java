package com.dao;

import com.bean.Custom_made;
import com.bean.Custom_madeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Custom_madeMapper {
    long countByExample(Custom_madeExample example);

    int deleteByExample(Custom_madeExample example);

    int deleteByPrimaryKey(Long customMadeId);

    int insert(Custom_made record);

    int insertSelective(Custom_made record);

    List<Custom_made> selectByExample(Custom_madeExample example);

    int updateByExampleSelective(@Param("record") Custom_made record, @Param("example") Custom_madeExample example);

    int updateByExample(@Param("record") Custom_made record, @Param("example") Custom_madeExample example);
}