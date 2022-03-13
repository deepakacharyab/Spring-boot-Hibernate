package com.deepak.springboot.controller;

import com.deepak.springboot.entity.Department;
import com.deepak.springboot.service.DepartmentService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping(value = "/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        LOGGER.info("Inside save department controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping(value = "/departments")
    public  List<Department> getDepartment(){
        LOGGER.info("Inside get department controller");
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

    @GetMapping(value = "/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }
}
