package com.mukundmadhav.springboot.springboot.componet.Department.service;

import com.mukundmadhav.springboot.springboot.componet.Department.entity.Department;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentService {
    Department save(int departmentId, String departmentName);
}
