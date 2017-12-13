package com.service.Impl;

import com.bean.Photographer;
import com.dao.PhotographerDao;
import com.dao.PhotographerMapper;
import com.service.PhotographerService;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Create By 文童 2017/12/2
 * 摄影师服务实现
 */
@Service("photographerService")
public class PhotographerServiceImpl implements PhotographerService{

    //摄影师dao
    @Resource
    PhotographerDao photographerDao;

    //摄影师Mapper
    @Resource
    PhotographerMapper photographerMapper;
    /**
     * 摄影师注册
     * @param userId
     * @param realyName
     * @param ID_number
     * @param sex
     * @return
     */
    @Override
    public int photographerRegister(int userId, String realyName, String ID_number, char sex) {
        return photographerDao.photographerRegister(userId,realyName, ID_number,sex);
    }

    /**
     * 通过摄影师的ID查找摄影师的详细信息
     * @param photographerId
     * @return
     *          Map [{photographer_name=woleiwolei, ID_number=123456789123456789, photographer_state=0, gender=M, photographer_success_times=1, photographer_id=1}]
     */
    @Override
    public Map<String, Object> getPhotographerDetailsById(int photographerId) {
        return photographerDao.getPhotographerDetailsById(photographerId);
    }
    /**
     * 通过摄影师的ID查找摄影师的详细信息
     * @param photographerName
     * @return
     *          Map [{photographer_name=woleiwolei, ID_number=123456789123456789, photographer_state=0, gender=M, photographer_success_times=1, photographer_id=1}]
     */
    @Override
    public List<Photographer> getPhotographersByName(String photographerName) {
        return photographerMapper.selectByPhotographerName(photographerName) ;
    }

    @Override
    public int updatePhotographerIntro(int photographerId, String intro) {
        return photographerDao.updatePhotographerIntro(photographerId,intro);
    }
}
