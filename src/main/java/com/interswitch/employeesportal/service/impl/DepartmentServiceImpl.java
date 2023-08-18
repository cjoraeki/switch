package com.interswitch.employeesportal.service.impl;

import com.interswitch.employeesportal.repository.DepartmentRepository;
import com.interswitch.employeesportal.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;


}
