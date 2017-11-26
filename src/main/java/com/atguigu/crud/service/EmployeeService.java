package com.atguigu.crud.service;

import com.atguigu.crud.bean.Employee;
import com.atguigu.crud.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/19.
 */

@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;
   //查询所有员工
    public List<Employee> getAll(){
        return  employeeMapper.selectByExampleWithDept(null);
    }
}
