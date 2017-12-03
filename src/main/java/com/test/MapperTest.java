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
    SqlSession sqlSession;
    @Autowired
    U_to_p_messageMapper u_to_p_messageMapper;
    @Autowired
    P_to_u_messageMapper p_to_u_messageMapper;
    @Autowired
    Custom_madeMapper custom_madeMapper;

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
//        //1.测试摄影师通过ID，获取用户给其留言---》成功
//        System.out.println("111");
//       List<U_to_p_message>
//         messages=u_to_p_messageMapper.selectByPhotographerId(Long.valueOf(2));
//        System.out.println("2222");
////        System.out.println(message);
//       for (U_to_p_message u_to_p_message:messages){
//           System.out.println(u_to_p_message);
//       }

        //2.测试用户通过ID，获取到摄影师给用户的回复~~
//        List<P_to_u_message> messages=p_to_u_messageMapper.selectByUserId(Long.valueOf(1));
//        for (P_to_u_message me:messages){
//            System.out.println(me);
//        }
        //3.1用户添加定制的订单
       custom_madeMapper.insert(new Custom_made(null,"湖南大学","二班",20,"令下","12345678911","wu",2));
        System.out.println("插入成功~~~");

       //3.2.测试查询各类型的定制订单
//        List<Custom_made> custom_mades=custom_madeMapper.selectByCustomType(2);
//        for (Custom_made c:custom_mades){
//            System.out.println(c);
//        }
    }
}