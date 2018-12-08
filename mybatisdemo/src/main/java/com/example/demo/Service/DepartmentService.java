package com.example.demo.Service;

import com.example.demo.Entity.Department;
import com.github.pagehelper.PageInfo;

/**
 * Created by curry on 18-12-7.
 */
public interface DepartmentService {

    public PageInfo<Department> findByPage(Integer page, Integer pageSize);

}
