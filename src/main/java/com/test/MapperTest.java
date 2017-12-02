package com.test;
import com.bean.U_to_p_message;
import com.bean.User;
import com.dao.U_to_p_messageMapper;
import com.dao.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2017/11/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class MapperTest {

    @Autowired
    UserMapper userMapper;
    @Autowired
    SqlSession sqlSession;
    @Autowired
    U_to_p_messageMapper u_to_p_messageMapper;

    @Test
    public void testCRUD() {
//        1.测试用户增加 ----》成功
//        userMapper.insert(
//                new User("haha5","ling",15451515,"44518@163.com"));
//        System.out.println("插入成功了~~");
//        2.测试用户查询--->成功
        User user = userMapper.selectByPrimaryKey(Long.valueOf(1));
        System.out.println(user);
//        3.模糊查询.
    }

    @Test
    public void testGetMessages() {
        //1.测试摄影师通过ID，获取用户给其留言---》成功
        System.out.println("111");
       List<U_to_p_message>
         messages=u_to_p_messageMapper.selectByPhotographerId(Long.valueOf(2));
        System.out.println("2222");
//        System.out.println(message);
       for (U_to_p_message u_to_p_message:messages){
           System.out.println(u_to_p_message);
       }
    }
}