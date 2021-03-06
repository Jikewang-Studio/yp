package com.service.Impl;

import com.bean.User;
import com.dao.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/27.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
     /**
     * 1.管理者查询用户
     * @param userName
     */
    public List<User> getUsers(String userName){
        return userMapper.selectByUserName(userName);
    }
    /**
     *  1.注册用户
     *  @param user
     */

    public void registerUser(User user){
        userMapper.insert(user);
    }

    /**
     * 2.登录验证(用户手机，密码)
     * @param phoneNumber
     * @param password
     */
   public User checkLogin(String phoneNumber,String password) {
       User user=userMapper.findUserByPhoneNumber(phoneNumber);
       if (user!=null && user.getPassword().equals(password)){
           return  user;
       }
       return null;
   }
}
