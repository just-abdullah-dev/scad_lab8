package com.example.HRSystem.service;

import com.example.HRSystem.entity.Employee;
import com.example.HRSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    // Add a new Employee
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    // Clone an Employee by ID
    public Employee cloneEmployee(Long employeeId) {
        Optional<Employee> employeeOptional = employeeRepository.findById(employeeId);
        if (employeeOptional.isPresent()) {
            Employee clonedEmployee = employeeOptional.get().clone();
            return employeeRepository.save(clonedEmployee);
        }
        return null;
    }
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
