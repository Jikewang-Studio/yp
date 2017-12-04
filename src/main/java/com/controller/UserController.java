package com.controller;

import com.bean.User;
import com.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 * Created by Administrator on 2017/11/27.
 */
@Controller
public class UserController {
    @Autowired
    UserServiceImpl userService;

   //1.1.注册用户
    public  void addUser(User user){
        userService.registerUser(user);
    }
    //1.2用户登录【手机和密码的验证】
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
