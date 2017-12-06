package com.test;
import com.bean.Custom_made;
import com.bean.P_to_u_message;
import com.bean.U_to_p_message;
import com.bean.User;
import com.dao.Custom_madeMapper;
import com.dao.P_to_u_messageMapper;
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
    U_to_p_messageMapper u_to_p_messageMapper;
    @Autowired
    P_to_u_messageMapper p_to_u_messageMapper;
    @Autowired
    Custom_madeMapper custom_madeMapper;
    @Autowired
    SqlSession sqlSession;

    @Test
    public void testCRUD() {
//        1.测试用户增加 ----》成功
//        userMapper.insert(
//                new User("haha5","ling",15451515,"44518@163.com"));
//        System.out.println("插入成功了~~");
//        2.测试用户查询--->成功
//       User user=userMapper.selectByPrimaryKey(Long.valueOf(1));
//        System.out.println(user);
//        3.模糊查询.
    }

    @Test
    public void testMeaages() {
        //1.测试摄影师根据Id，获取到用户给自己的留言信息---》成功
//        List<U_to_p_message> messages = u_to_p_messageMapper.selectByPhotographerId(Long.valueOf(2));
//        for (U_to_p_message message : messages) {
//            System.out.println(message);
//            System.out.println("插入了~~");
//        }

         //2.1测试用户给摄影师留言。--->成功
        u_to_p_messageMapper.addMessage
        (new U_to_p_message("哈哈",Long.valueOf(1),Long.valueOf(2)));
        System.out.println("插入成功~");

        //2.2测试用户根据Id，获取到摄影师给自己的留言。-->测试成功
//   List<P_to_u_message> messages=p_to_u_messageMapper.selectByUserId(Long.valueOf(1));
//    for (P_to_u_message message:messages){
//        System.out.println(message);
//    }
    }

    @Test
    public void testCustomMade(){
        //3.1用户提交定制订单
        custom_madeMapper.insert
           (new Custom_made(null,"背影大学","经管二班",10,"张先生","12345678915",null,0));
        System.out.println("用户提交定制订单成功！！");
    }
}
