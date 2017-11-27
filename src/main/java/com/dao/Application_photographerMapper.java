package com.dao;

import com.bean.Application_photographer;
import com.bean.Application_photographerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Application_photographerMapper {
    long countByExample(Application_photographerExample example);

    int deleteByExample(Application_photographerExample example);

    int insert(Application_photographer record);

    int insertSelective(Application_photographer record);

    List<Application_photographer> selectByExample(Application_photographerExample example);

    int updateByExampleSelective(@Param("record") Application_photographer record, @Param("example") Application_photographerExample example);

    int updateByExample(@Param("record") Application_photographer record, @Param("example") Application_photographerExample example);
}