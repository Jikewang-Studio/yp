package com.atguigu.crud.test;

import com.atguigu.crud.bean.Employee;
import com.github.pagehelper.PageInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * Created by Administrator on 2017/11/20.
 */
/*
* 使用Spring测试模块提供的测试请求功能，测试crud请求的正确性
* */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml",
        "classpath:dispatcherServlet-servlet.xml"})
//"file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml"})
public class MvcTest {
    //传入SpringMVC的ioc
    @Autowired
    WebApplicationContext context;
    //虚拟mvc请求，获取到处理结果。
    MockMvc mockMvc;

    @Before
    public void initMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();//初始化MockMvc对象
    }

    @Test
    public void testPage() throws Exception {
        //模拟请求,并拿到返回值
//      String
        MvcResult result = mockMvc.perform(get
                ("/emps").param("pn", "1"))
                .andReturn();
//              .getResponse().getContentAsString();
//        System.out.println(result==null);
        System.out.println("ddddddddddd" + result);

     //请求成功后，请求域中会有pageInfo：我们可以取出pageInfo进行验证
        MockHttpServletRequest request = result.getRequest();
//
        System.out.println("request" + request == null);
        PageInfo pi = (PageInfo) request.getAttribute("pageInfo");
        request.getAttribute("pageInfo");
//        System.out.println("yyyyy");
//        System.out.println(pi);
//        System.out.println("当前页码" + pi.getPageNum());
//        System.out.println("总页码" + pi.getPages());
//        System.out.println("总记录数" + pi.getTotal());
//        System.out.println("在页面需要连续显示的页码");
//        int[] nums = pi.getNavigatepageNums();
//        for (int i : nums) {
//            System.out.print(" " + i);
//        }
//        //获取员工数据
//        List<Employee> list = pi.getList();
//        for (Employee employee : list) {
//            System.out.println("ID:" + employee.getEmpId() + "=====>" + employee.getEmpName());
//        }
    }
}
