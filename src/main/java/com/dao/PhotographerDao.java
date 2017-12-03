package com.dao;

import com.bean.Photographer;
import com.bean.PhotographerExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Create by 文童 2017/12/2
 * 摄影师表操作
 */
@Repository
public interface PhotographerDao {

    /**
     * 摄影师注册
     * @param userId                所属用户ID
     * @param realyName             摄影师真实姓名
     * @param ID_number             摄影师身份证号
     * @param sex                   摄影师性别
     * @return
     */
    public int photographerRegister(@Param("userId") int userId,@Param("realyName")String realyName,@Param("ID_number")String ID_number,@Param("sex")char sex);

    /**
     * 通过摄影师Id获取摄影师详细信息
     * @param PG_id
     * @return
     */
    public Map<String ,Object> getPhotographerDetailsById(int PG_id);

    /**
     * 更新摄影师简介
     * @param intro
     * @return
     */
    public int updatePhotographerIntro(@Param("photographerId") int photographerId,@Param("intro") String intro);
}