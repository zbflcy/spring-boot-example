package com.example.demo.Service;

import com.example.demo.Entity.Employee;
import com.github.pagehelper.PageInfo;

/**
 * Created by curry on 18-12-8.
 */
public interface EmployeeService {

    public PageInfo<Employee> findEmpByPage(Integer page, Integer pageSize);
}
