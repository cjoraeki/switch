package com.interswitch.employeesportal.controller;


import com.interswitch.employeesportal.model.EmployeeCategory;
import com.interswitch.employeesportal.service.EmployeeCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/employeecategories")
public class EmployeeCategoryController {
    private final EmployeeCategoryService employeeCategoryService;

    @PostMapping("/add")
    public ResponseEntity<?> createACategory(@RequestBody EmployeeCategory employeeCategory){
        return new ResponseEntity<>(employeeCategoryService
                .addEmployeeCategory(employeeCategory), HttpStatus.OK);
    }
}
