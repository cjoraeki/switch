package com.interswitch.employeesportal.service.impl;

import com.interswitch.employeesportal.model.EmployeeCategory;
import com.interswitch.employeesportal.repository.EmployeeCategoryRepository;
import com.interswitch.employeesportal.service.EmployeeCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class EmployeeCategoryServiceImpl implements EmployeeCategoryService {
    private final EmployeeCategoryRepository employeeCategoryRepository;

    @Override
    public EmployeeCategory addEmployeeCategory(EmployeeCategory employeeCategory) {
        EmployeeCategory newCategory = new EmployeeCategory();
        newCategory.setName(employeeCategory.getName());
        newCategory.setDescription(employeeCategory.getDescription());
        employeeCategoryRepository.save(newCategory);
        return newCategory;
    }
}
