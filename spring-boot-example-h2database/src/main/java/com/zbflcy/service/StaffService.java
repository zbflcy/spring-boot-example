package com.zbflcy.service;

import com.zbflcy.entity.Staff;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by curry on 18-12-10.
 */
public interface StaffService {

    List<Staff> getAll();

    Page<Staff> getStaff(int pageNum, int pageSize);


    Staff getStaff(int id);

    Staff addStaff(Staff staff);

    void deleteStaff(Staff staff);


}
