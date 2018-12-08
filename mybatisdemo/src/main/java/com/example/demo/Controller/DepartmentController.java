package com.example.demo.Controller;

import com.example.demo.Entity.Department;
import com.example.demo.Mapper.DepartmentMapper;
import com.example.demo.Service.DepartmentService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by curry on 18-12-7.
 */
@RestController
public class DepartmentController {

    @Autowired
    DepartmentMapper departmentMapper;


    @Autowired
    DepartmentService departmentService;


    @GetMapping(value = "/depts/{page}")
    public PageInfo<Department> getDeptByPage(@PathVariable("page") Integer page) {
        return departmentService.findByPage(page, 5);
    }


    @GetMapping(value = "/dept/{id}")
    public Department getDeptById(@PathVariable("id") Integer id) {
        return departmentMapper.getDeptById(id);
    }


    @GetMapping(value = "/depts")
    public List<Department> getAll() {
        return departmentMapper.getAll();
    }


    @GetMapping(value = "/dept")
    public Integer addDept(Department department) {
        return departmentMapper.insertDept(department);
    }

    @GetMapping(value = "/delDept/{id}")
    public Integer deleteDept(@PathVariable("id") Integer id) {
        return departmentMapper.deleteDeptById(id);
    }

}
