package com.interswitch.employeesportal.service;

import com.interswitch.employeesportal.model.Employee;

import java.util.Collection;
import java.util.Optional;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    Optional<Employee> getEmployee(Long id);
    Collection<Employee> getEmployees();
    Optional<Employee> updateEmployee(Long id, Employee employee) throws IllegalAccessException;
}
