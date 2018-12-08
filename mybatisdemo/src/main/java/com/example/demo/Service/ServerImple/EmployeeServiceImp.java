package com.example.demo.Service.ServerImple;

import com.example.demo.Entity.Employee;
import com.example.demo.Mapper.EmployeeMapper;
import com.example.demo.Service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by curry on 18-12-8.
 */
@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;


    @Override
    public PageInfo<Employee> findEmpByPage(Integer page, Integer pageSize) {
        PageHelper.startPage(page, pageSize);
        return new PageInfo<>(employeeMapper.getAll());
    }
}
