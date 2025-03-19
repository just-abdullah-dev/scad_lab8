package com.example.EmployeeManagement.factory;

public class FullTimeEmployee implements Employee {
    @Override
    public String getEmployeeType() {
        return "Full-Time Employee";
    }
}
