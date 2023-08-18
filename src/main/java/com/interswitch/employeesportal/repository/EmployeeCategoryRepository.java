package com.interswitch.employeesportal.repository;

import com.interswitch.employeesportal.model.EmployeeCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeCategoryRepository extends JpaRepository<EmployeeCategory, Long> {
}
