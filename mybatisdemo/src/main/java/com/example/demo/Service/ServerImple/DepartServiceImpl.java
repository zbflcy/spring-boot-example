package com.example.demo.Service.ServerImple;

import com.example.demo.Entity.Department;
import com.example.demo.Mapper.DepartmentMapper;
import com.example.demo.Service.DepartmentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by curry on 18-12-7.
 */
@Service
public class DepartServiceImpl implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public PageInfo<Department> findByPage(Integer page, Integer pageSize) {
        PageHelper.startPage(page, pageSize);
        return new PageInfo<Department>(departmentMapper.getAll());
    }
}
