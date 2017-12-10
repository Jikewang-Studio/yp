package com.dao;

import com.bean.Photographer;
import com.bean.PhotographerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotographerMapper {
    Integer countByExample(PhotographerExample example);

    int deleteByExample(PhotographerExample example);

    int deleteByPrimaryKey(Integer photographerId);

    int insert(Photographer record);

    int insertSelective(Photographer record);

    List<Photographer> selectByExample(PhotographerExample example);
   //1.管理者通过摄影师名字查找到摄影师
    List<Photographer> selectByPhotographerName(String photographerName);


    Photographer selectByPrimaryKey(Integer photographerId);

    int updateByExampleSelective(@Param("record") Photographer record, @Param("example") PhotographerExample example);

    int updateByExample(@Param("record") Photographer record, @Param("example") PhotographerExample example);

    int updateByPrimaryKeySelective(Photographer record);

    int updateByPrimaryKey(Photographer record);
}