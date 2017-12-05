package com.dao;

import com.bean.User;
import com.bean.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long userId);
    //2.用户注册。
    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);
   //1.管理者查询用户
    List<User> selectByUserName(String userName);

    User selectByPrimaryKey(Long userId);

    //2.登录验证(用户手机，密码)
    User findUserByPhoneNumber(Integer phoneNumber);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}