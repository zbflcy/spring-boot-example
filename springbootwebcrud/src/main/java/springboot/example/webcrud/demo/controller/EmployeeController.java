package springboot.example.webcrud.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springboot.example.webcrud.demo.dao.DepartmentDao;
import springboot.example.webcrud.demo.dao.EmployeeDao;
import springboot.example.webcrud.demo.entities.Department;
import springboot.example.webcrud.demo.entities.Employee;

import java.util.Collection;

@Controller
public class EmployeeController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;

    @GetMapping("/emps")
    public String getEmployees(Model model) {
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps", employees);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAddPage(Model model) {
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts", departments);
        return "emp/add";
    }


    @PostMapping("/emp")
    public String add(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @GetMapping(value = "/emp/{id}")
    public String toUpdatePage(@PathVariable("id") Integer id, Model model) {
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp", employee);
        model.addAttribute("depts", departmentDao.getDepartments());
        return "emp/add";
    }


    @PutMapping(value = "/emp")
    public String updateEmployee(Employee employee) {
        logger.info(employee.toString());
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @DeleteMapping(value = "/emp/{id}")
    public String delete(@PathVariable("id") Integer id) {
        logger.info("delete employee id: " + id);
        employeeDao.delete(id);
        return "redirect:/emps";
    }


}
