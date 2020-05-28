package com.kodilla.patterns.adapter.company;

import com.kodilla.patterns.adapter.company.newhrsystem.CompanySalaryProcessor;
import com.kodilla.patterns.adapter.company.newhrsystem.Employee;
import com.kodilla.patterns.adapter.company.newhrsystem.SalaryProcessor;

import java.math.BigDecimal;
import java.util.List;

public class SalaryAdaptee implements SalaryProcessor {
    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        CompanySalaryProcessor theProcessor = new CompanySalaryProcessor();
        return theProcessor.calculateSalaries(employees);
    }
}
