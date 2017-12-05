package com.controller;

import com.bean.Custom_made;
import com.bean.Photographer;
import com.bean.User;
import com.github.pagehelper.PageInfo;
import com.service.Impl.CustomServiceImpl;
import com.service.PhotographerService;
//import com.service.UserService;
import com.service.Impl.UserServiceImpl;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2017/12/3.
 */
@Controller
public class ManagerController {
    @Autowired
    UserService userService;
    @Autowired
    PhotographerService photographerService;
    @Autowired
    CustomServiceImpl customService;
    //1.1管理者，管理用户。
    @RequestMapping("/getusers")
    public String getUsers(String userName,Model model){
        List<User> users=userService.getUsers(userName);
        PageInfo page=new PageInfo(users,5);
        model.addAttribute("UpageInfo",page);
        return "list-user";
    }
    //1.2管理者，管理摄影师.
    public String getPhotographers(String photographerName,Model model){
        List<Photographer> photographers=
                photographerService.getPhotographersByName(photographerName);
        PageInfo page=new PageInfo(photographers);
        model.addAttribute("PpageInfo",page);
        return "list-photographer";
    }
    //2.1管理者，查看三种类型的定制
    public String getCustom(Integer customType,Model model){
        List<Custom_made> custom_mades=customService.getCustoms(customType);
        model.addAttribute(custom_mades);
        return "list-customs";
    }
}
