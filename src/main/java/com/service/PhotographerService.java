package com.service;

import com.bean.Photographer;
import com.dao.PhotographerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/29.
 */
@Service
public class PhotographerService {
    @Autowired
    PhotographerMapper photographerMapper;
    public List<Photographer> getPhotographers(String photographerName){
        return photographerMapper.selectByPhotographerName(photographerName);
    }
}
