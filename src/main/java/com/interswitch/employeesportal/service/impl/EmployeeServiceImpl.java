package com.interswitch.employeesportal.service.impl;

import com.interswitch.employeesportal.model.Employee;
import com.interswitch.employeesportal.model.EmployeeCategory;
import com.interswitch.employeesportal.repository.EmployeeCategoryRepository;
import com.interswitch.employeesportal.repository.EmployeeRepository;
import com.interswitch.employeesportal.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final EmployeeCategoryRepository employeeCategoryRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        Employee newEmployee = new Employee();
        newEmployee.setName(employee.getName());
        newEmployee.setPhone(employee.getPhone());
        newEmployee.setAddress(employee.getAddress());
        newEmployee.setDateOfBirth(employee.getDateOfBirth());
        newEmployee.setDepartmentId(employee.getDepartmentId());
        newEmployee.setJoinedDate(LocalDate.now());

        EmployeeCategory empCategory = employeeCategoryRepository.findById(employee.getId())
                .orElseThrow(() -> new IllegalArgumentException("Employee category not found"));
        newEmployee.setEmployeeCategoryId(empCategory.getId());

        return employeeRepository.save(newEmployee);
    }

    @Override
    public Optional<Employee> getEmployee(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Collection<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> updateEmployee(Long id, Employee employee) throws IllegalArgumentException, IllegalAccessException {
        Optional<Employee> registeredEmployee = employeeRepository.findById(id);
        if (registeredEmployee.isPresent()){
            Employee employeeUpdate = new Employee();
            employeeUpdate.setName(employee.getName());
            employeeUpdate.setPhone(employee.getPhone());
            employeeUpdate.setJoinedDate(registeredEmployee.get().getJoinedDate());
            employeeUpdate.setId(registeredEmployee.get().getId());
            employeeRepository.save(employeeUpdate);
            return Optional.of(employeeUpdate);
        }throw new IllegalAccessException("Customer does not exist");
    }
}
