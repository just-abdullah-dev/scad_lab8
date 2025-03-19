package com.example.HRSystem.controller;

import com.example.HRSystem.entity.Employee;
import com.example.HRSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Add an Employee
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    // Clone an Employee
    @PostMapping("/clone/{id}")
    public Employee cloneEmployee(@PathVariable Long id) {
        return employeeService.cloneEmployee(id);
    }

    // Get all Employees
    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}
