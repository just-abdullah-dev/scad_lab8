package com.example.EmployeeManagement.controller;

import com.example.EmployeeManagement.factory.Employee;
import com.example.EmployeeManagement.factory.EmployeeFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @GetMapping("/{type}")
    public String getEmployee(@PathVariable String type) {
        try {
            Employee employee = EmployeeFactory.createEmployee(type);
            return "Created Employee Type: " + employee.getEmployeeType();
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
}
