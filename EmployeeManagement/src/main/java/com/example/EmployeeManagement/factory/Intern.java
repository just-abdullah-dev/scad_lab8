package com.example.EmployeeManagement.factory;

public class Intern implements Employee {
    @Override
    public String getEmployeeType() {
        return "Intern";
    }
}
