package com.example.demo.Mapper;

import com.example.demo.Entity.Department;
import org.apache.ibatis.annotations.*;

import java.util.List;


/**
 * Created by curry on 18-12-7.
 */
@Mapper
public interface DepartmentMapper {





    @Select("select id,departmentName from department")
    public List<Department> getAll();


    @Select("select id,departmentName from department where id=#{id}")

    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);


    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);


    @Update("update deparment set departmentName=#{deparmentName}")
    public int updateDept(Department department);


}
