package com.controller;

import com.bean.Custom_made;
import com.bean.User;
import com.service.CustomService;
import com.service.Impl.UserServiceImpl;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 * Created by Administrator on 2017/11/27.
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    CustomService customService;
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
    //2.1用户提交定制信息。
    public void insertCustom(Custom_made custom_made){
        customService.insertCustom(custom_made);
    }
}
