package com.example.EmployeeManagement.factory;

public class PartTimeEmployee implements Employee {
    @Override
    public String getEmployeeType() {
        return "Part-Time Employee";
    }
}
