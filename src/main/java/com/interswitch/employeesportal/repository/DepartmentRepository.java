package com.interswitch.employeesportal.repository;

import com.interswitch.employeesportal.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
