package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping("/employees")
    public List<Employee> getAll() {
        return service.listAll();
    }

    @GetMapping("/employee/{id}")
    public Employee getOne(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping("/employee")
    public Employee add(@RequestBody Employee emp) {
        return service.save(emp);
    }

    @PutMapping("/employee/{id}")
    public Employee update(@PathVariable Long id, @RequestBody Employee emp) {
        return service.updateEmployee(id, emp);
    }

    @DeleteMapping("/employee/{id}")
    public void remove(@PathVariable Long id) {
        service.delete(id);
    }
}