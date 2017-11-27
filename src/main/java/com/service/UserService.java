package com.service;

import com.bean.User;
import com.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/27.
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> getAll(){
        return userMapper.selectByExample(null);
    }
}
