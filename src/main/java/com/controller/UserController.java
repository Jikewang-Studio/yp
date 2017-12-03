package com.controller;

import com.bean.Photographer;
import com.bean.User;
import com.github.pagehelper.PageInfo;
import com.service.PhotographerService;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2017/11/27.
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    PhotographerService photographerService;

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

        return "list-photographer";
    }
   //2.1.注册用户
    public  void addUser(User user){
        userService.registerUser(user);
    }
    //2.2用户登录【手机和密码的验证】
    public String userLogin
    (User user,Model model) throws  Exception{
      user=userService.checkLogin(user.getPhoneNumber(),user.getPassword());
      if (user!=null){
          model.addAttribute(user);
          return "welcome";
      }
      return "fail";
    }
}
