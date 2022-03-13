package com.deepak.springboot.service;

import com.deepak.springboot.entity.Department;
import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);
    public List<Department> getDepartment();
    public Department getDepartmentById(Long Id);
    public Department updateDepartment(Long Id, Department department);

}
