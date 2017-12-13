package com.controller;

import com.service.PhotographerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Create by 文童 2017/12/2
 * 摄影师控制器
 */
@Controller
@RequestMapping("/photographer")
public class PhotographerController {

    @Resource
    private PhotographerService photographerService;

    /**
     * 摄影师注册
     * @param userId
     * @param realyName
     * @param ID_number
     * @param sex
     * @return
     */
    @RequestMapping(value = "/register", method = {RequestMethod.POST})
    @ResponseBody
    public int photographerRegister(@RequestParam("userId") String userId,@RequestParam("realyName") String realyName,@RequestParam("ID_number") String ID_number,@RequestParam("sex") String sex){
        return photographerService.photographerRegister(Integer.valueOf(userId),realyName,ID_number,sex.charAt(0));
    }

    /**
     * 更新摄影师简介
     * @param photographerId
     * @param intro
     * @return
     */
    @RequestMapping(value = "changeIntro",method = {RequestMethod.POST})
    @ResponseBody
    public int changeIntro(@RequestParam("photographerId") String photographerId,@RequestParam("intro") String intro){
        int reslut = photographerService.updatePhotographerIntro(Integer.valueOf(photographerId),intro);
        return reslut;
    }

    /**
     * 获得指定摄影师Id
     * @param photographerId
     * @return
     */
    @RequestMapping(value = "/getPhotographerDetailsById",method = {RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> getPhotographerDetailsById(@RequestParam("photographerId") String photographerId){
        return photographerService.getPhotographerDetailsById(Integer.valueOf(photographerId));
    }
}
