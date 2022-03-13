package com.deepak.springboot.controller;

import com.deepak.springboot.entity.Department;
import com.deepak.springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping(value = "/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping(value = "/departments")
    public  List<Department> getDepartment(){
        return departmentService.getDepartment();
    }

    @GetMapping(value = "/departments/{id}")
    public  Department getDepartmentById(@PathVariable("id") Long Id){
        return departmentService.getDepartmentById(Id);
    }

    @PutMapping(value = "/updatedepartment/{id}")
    public  Department getDepartmentById(@PathVariable("id") Long Id, @RequestBody Department department){
        return departmentService.updateDepartment(Id, department);
    }
}
