package com.dao;

import com.bean.Works;
import com.bean.WorksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorksMapper {
    long countByExample(WorksExample example);

    int deleteByExample(WorksExample example);

    int deleteByPrimaryKey(Long worksId);

    int insert(Works record);

    int insertSelective(Works record);

    List<Works> selectByExample(WorksExample example);

    Works selectByPrimaryKey(Long worksId);

    int updateByExampleSelective(@Param("record") Works record, @Param("example") WorksExample example);

    int updateByExample(@Param("record") Works record, @Param("example") WorksExample example);

    int updateByPrimaryKeySelective(Works record);

    int updateByPrimaryKey(Works record);
}