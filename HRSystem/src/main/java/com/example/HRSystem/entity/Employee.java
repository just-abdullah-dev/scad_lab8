package com.example.HRSystem.entity;
import jakarta.persistence.*;
@Entity
public class Employee implements Cloneable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String department;
    private double salary;
    // Default Constructor
    public Employee() {}
    // Parameterized Constructor
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
    // Implementing the Prototype Pattern using Cloneable
    @Override
    public Employee clone() {
        return new Employee(this.name, this.department, this.salary);
    }
}
