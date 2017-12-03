package com.service;

import com.bean.Photographer;
import com.dao.PhotographerDao;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Create by 文童 2017/12/2
 * 摄影师的服务层
 */

public interface PhotographerService {

    /**
     * 摄影师注册
     * @param userId
     * @param realyName
     * @param ID_number
     * @param sex
     * @return
     */
    public int photographerRegister(int userId,String realyName,String ID_number,char sex);

    /**
     * 通过摄影师的ID查找摄影师的详细信息
     * @param photographerId
     * @return
     */
    public Map<String ,Object> getPhotographers(int photographerId);

   /*
    * 管理者，通过摄影师的名字。来模糊查询摄影师信息
    * @param photographerName
    * @return
    */
    public List<Photographer> getPhotographersByName(String photographerName);

    /**
     * 更新摄影师简介
     * @param photographerId
     * @param intro
     * @return
     */
    public int updatePhotographerIntro(int photographerId,String intro);


}
