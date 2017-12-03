//package com.test;
//import org.apache.ibatis.session.SqlSession;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
///**
// * Created by Administrator on 2017/11/27.
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:applicationContext.xml")
//public class MapperTest{
//
//    @Autowired
//    UserMapper userMapper;
//    @Autowired
//    SqlSession sqlSession;
//
//    @Test
//    public void testCRUD(){
////        1.测试用户增加 ----》成功
////        userMapper.insert(
////                new User("haha5","ling",15451515,"44518@163.com"));
////        System.out.println("插入成功了~~");
////        2.测试用户查询--->成功
////       User user=userMapper.selectByPrimaryKey(Long.valueOf(1));
////        System.out.println(user);
////        3.模糊查询.
//    }
//}
