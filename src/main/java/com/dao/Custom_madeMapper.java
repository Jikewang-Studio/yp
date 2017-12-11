package com.dao;

import com.bean.Custom_made;
import com.bean.Custom_madeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Custom_madeMapper {
    Integer countByExample(Custom_madeExample example);

    int deleteByExample(Custom_madeExample example);

    int deleteByPrimaryKey(Integer customMadeId);
    //1.用户添加定制
    int insert(Custom_made record);

    int insertSelective(Custom_made record);

    List<Custom_made> selectByExample(Custom_madeExample example);
    //2.管理者，通过类型查看所有的定制情况
    List<Custom_made> selectByCustomType(Integer customType);

    Custom_made selectByPrimaryKey(Integer customMadeId);

    int updateByExampleSelective(@Param("record") Custom_made record, @Param("example") Custom_madeExample example);

    int updateByExample(@Param("record") Custom_made record, @Param("example") Custom_madeExample example);

    int updateByPrimaryKeySelective(Custom_made record);

    int updateByPrimaryKey(Custom_made record);
}