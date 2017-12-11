package com.service;

import com.bean.User;

import java.util.List;

/**
 * Created by 凌龙 on 2017/12/3.
 */
public interface UserService {
    /**
     *1.注册用户
     *  @param user
     */
    public void registerUser(User user);

    /**
     * 2.登录验证(用户手机，密码)
     * @param phoneNumber
     * @param password
     */
    public User checkLogin(String phoneNumber, String password);

    /**
     * 1.管理者,根据用户名字模糊查询用户
     * @param userName
     */
    public List<User> getUsers(String userName);

    /**
     * 3.1用户添加关注摄影师
     * @param userId
     * @param photographerId
     */
     public void addAttention(int userId,int photographerId);
}
