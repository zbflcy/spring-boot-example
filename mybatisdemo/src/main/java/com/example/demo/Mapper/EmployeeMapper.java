package com.example.demo.Mapper;

import com.example.demo.Entity.Employee;

import java.util.List;

/**
 * Created by curry on 18-12-8.
 */
public interface EmployeeMapper {


    public Employee getEmpById(Integer id);


    public void insertEmp(Employee employee);


    public List<Employee> getAll();


}
