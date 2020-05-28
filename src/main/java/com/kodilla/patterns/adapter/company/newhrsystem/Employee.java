package com.kodilla.patterns.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.Objects;

public class Employee {
    final private String peselId;
    final private String firstName;
    final private String lastname;
    final private BigDecimal baseSalary;

    public Employee(String peselId, String firstName, String lastname, BigDecimal baseSalary) {
        this.peselId = peselId;
        this.firstName = firstName;
        this.lastname = lastname;
        this.baseSalary = baseSalary;
    }

    public String getPeselId() {
        return peselId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(peselId, employee.peselId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peselId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "peselId='" + peselId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
