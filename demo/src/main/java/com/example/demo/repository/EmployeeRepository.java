package com.example.demo.repository;

import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Procedure(procedureName = "GetAllEmployees")
    List<Employee> callGetAllEmployees();

    @Procedure(procedureName = "GetEmployeeById")
    Employee callGetEmployeeById(Long id);

    @Procedure(procedureName = "CountEmployeesByDept")
    Integer countByDept(Integer dept_id);
}