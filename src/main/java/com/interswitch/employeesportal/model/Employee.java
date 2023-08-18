package com.interswitch.employeesportal.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    private String phone;
    private String address;
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @Column(name = "joined_date")
    private LocalDate joinedDate;
    @Column(name = "department_id")
    private int departmentId;
    @Column(name = "employee_category_id")
    private Long employeeCategoryId;
}
