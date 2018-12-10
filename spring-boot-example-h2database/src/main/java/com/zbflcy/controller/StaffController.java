package com.zbflcy.controller;

import com.zbflcy.entity.Staff;
import com.zbflcy.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by curry on 18-12-10.
 */
@RestController
public class StaffController {

    @Autowired
    StaffService staffService;


    @GetMapping("/staffs")
    public List<Staff> getStaffs() {
        return staffService.getAll();
    }

}
