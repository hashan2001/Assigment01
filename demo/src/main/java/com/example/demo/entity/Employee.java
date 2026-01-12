package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emp_id;

    @Column(nullable = false)
    private String emp_name;

    @Column(unique = true)
    private String email;

    @Column(columnDefinition = "VARCHAR(50) DEFAULT 'Colombo'")
    private String city;

    private Long dept_id;
    private Double salary;

    public Long getEmp_id() { return emp_id; }
    public void setEmp_id(Long emp_id) { this.emp_id = emp_id; }
    public String getEmp_name() { return emp_name; }
    public void setEmp_name(String emp_name) { this.emp_name = emp_name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public Long getDept_id() { return dept_id; }
    public void setDept_id(Long dept_id) { this.dept_id = dept_id; }
    public Double getSalary() { return salary; }
    public void setSalary(Double salary) { this.salary = salary; }
}