package com.zbflcy.service.serviceimpl;

import com.zbflcy.entity.Staff;
import com.zbflcy.repository.StaffRepository;
import com.zbflcy.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by curry on 18-12-10.
 */
@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    StaffRepository repository;

    @Override
    public List<Staff> getAll() {
        return repository.findAll();
    }


    @Override
    public Page<Staff> getStaff(int pageNum, int pageSize) {
        return repository.findAll(new PageRequest(pageNum, pageSize));
    }

    @Override
    public Staff getStaff(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Staff addStaff(Staff staff) {
        return repository.save(staff);
    }

    @Override
    public void deleteStaff(Staff staff) {
        repository.delete(staff);
    }
}
