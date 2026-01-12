package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public List<Employee> listAll() {
        return repository.callGetAllEmployees();
    }

    public Employee getById(Long id) {
        return repository.callGetEmployeeById(id);
    }

    public Employee save(Employee emp) {
        return repository.save(emp);
    }

    public Employee updateEmployee(Long id, Employee details) {
        Employee existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));

        existing.setEmp_name(details.getEmp_name());
        existing.setEmail(details.getEmail());
        existing.setCity(details.getCity());
        existing.setSalary(details.getSalary());
        existing.setDept_id(details.getDept_id());

        return repository.save(existing);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}