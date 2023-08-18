package com.interswitch.employeesportal.service.impl;

import com.interswitch.employeesportal.repository.SalaryRateRepository;
import com.interswitch.employeesportal.service.SalaryRateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class SalaryRateServiceImpl implements SalaryRateService {
    private final SalaryRateRepository salaryRateRepository;
}
