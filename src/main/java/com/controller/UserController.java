package com.controller;

import com.bean.Custom_made;
import com.bean.User;
import com.service.CustomService;
import com.service.UserService;
import com.utils.SendMessageUtil;
import org.apache.ibatis.annotations.Param;
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
    /**
     * 1.3用户修改密码,根据短信验证码直接修改
     * @param  phoneNum
     * @param radndomNum
     */
    public void changePassword(@Param("smsMob")String phoneNum,@Param("radndomNum")Integer radndomNum){
        SendMessageUtil sendMessageUtil=new SendMessageUtil();
        sendMessageUtil.setRadndomNum(radndomNum);
        sendMessageUtil.setSmsMob(phoneNum);
        sendMessageUtil.sendMessage();
    }

    /**
     * 2.1用户提交定制信息。
     * @param custom_made
     */
    public void insertCustom(Custom_made custom_made){
        customService.insertCustom(custom_made);
    }
}
