package com.example.EmployeeManagement.factory;

public class EmployeeFactory {
    public static Employee createEmployee(String type) {
        switch (type.toLowerCase()) {
            case "fulltime":
                return new FullTimeEmployee();
            case "parttime":
                return new PartTimeEmployee();
            case "intern":
                return new Intern();
            default:
                throw new IllegalArgumentException("Invalid employee type: " + type);
        }
    }
}
