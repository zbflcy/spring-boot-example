package com.example.demo.Controller;

import com.example.demo.Entity.Employee;
import com.example.demo.Mapper.EmployeeMapper;
import com.example.demo.Service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by curry on 18-12-8.
 */
@RestController
public class EmployeeController {


    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/emp/{id}")
    public Employee getEmpBy(@PathVariable("id") Integer id) {
        return employeeMapper.getEmpById(id);
    }

    @GetMapping(value = "/emps/{page}")
    public PageInfo<Employee> getEmp(@PathVariable(value = "page") Integer page) {
        return employeeService.findEmpByPage(page, 5);
    }


    @GetMapping(value = "/emp")

    public void insertEm(Employee employee) {
        employeeMapper.insertEmp(employee);
    }


}
