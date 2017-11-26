package com.atguigu.crud.test;

import com.atguigu.crud.bean.Department;
import com.atguigu.crud.bean.Employee;
import com.atguigu.crud.dao.DepartmentMapper;
import com.atguigu.crud.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/11/16.
 */
/*
* 测试dao层的工作
* 推荐Spring的项目就可以使用Spring的单元测试，
* 可以自动注入我们需要的组件【eg：1，2.从容器中获取mapper就可以注入】
*
* 1.导入SpringTest模块
* 2.@ContextConfiguration注解指定Spring配置文件的位置
* 3.直接autowired要使用的组件即可
*
* */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class MapperTest {
    /*
      测试DepartmentMapper
    * */
    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    SqlSession sqlSession;
   @Test
    public void testCRUD(){

//     //1.创建SpringIOC容器
//       System.out.println("1111");
//        ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
//       System.out.println("22222");
//        //2.从容器中获取mapper
//       DepartmentMapper bean=ioc.getBean(DepartmentMapper.class);

       System.out.println(departmentMapper);
       //1.插入几个部门：
//       departmentMapper.insertSelective(new Department(null,"1开发部"));
//       departmentMapper.insertSelective(new Department(null,"2测试部"));
       //2.生成员工数据表，测试员工插入
       employeeMapper.insert
       (new Employee(null,"gea","M","gema@163.com",1));
       //3.批量插入多个员工：可以使用执行批量操作的sqlSession
//       for(){
//           employeeMapper.insert
//                   (new Employee(null,"gea","M","gema@163.com",1));
//       }
       EmployeeMapper mapper=sqlSession.getMapper(EmployeeMapper.class);
       for (int i=0;i<100;i++){
           String uid= UUID.randomUUID().toString().substring(0,5)+i;
           mapper.insertSelective(new Employee(null,uid,"M",uid+"@163.com",1));
       }
//       for (int i=100;i<200;i++){
//           mapper.deleteByPrimaryKey(i);
//       }
       System.out.println("完成操作~");
   }
}
