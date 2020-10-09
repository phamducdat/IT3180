package com.mukundmadhav.springboot.springboot.componet.Department.repo;

import com.mukundmadhav.springboot.springboot.componet.Department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {
    Department save(Department dept);
}
