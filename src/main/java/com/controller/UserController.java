package com.controller;

import com.bean.User;
import com.github.pagehelper.PageInfo;
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
    @RequestMapping("/getusers")
    public String getUsers(Model model){
        List<User> users=userService.getAll();
        PageInfo page=new PageInfo(users,5);
        model.addAttribute("pageInfo",page);
        return "list-user";
    }
}
