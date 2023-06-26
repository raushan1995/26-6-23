package com.department.departmentservice.service;

import com.department.departmentservice.model.Department;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentService {
    Department saveDepartment(Department department);

    Department getDepartmentById(Long departmentId);
}
