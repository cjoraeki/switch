package com.interswitch.employeesportal.controller;


import com.interswitch.employeesportal.model.Employee;
import com.interswitch.employeesportal.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<String> createAnEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
            return new ResponseEntity<>("Employee created successfully", HttpStatus.OK);
    }
}
