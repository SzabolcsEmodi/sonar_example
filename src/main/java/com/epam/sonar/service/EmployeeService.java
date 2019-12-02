package com.epam.sonar.service;

import com.epam.sonar.logic.EmployeeLogic;
import com.epam.sonar.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeService {
    @Autowired
    private EmployeeLogic employeeLogic;

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return employeeLogic.getEmployee(id);
    }

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeLogic.saveEmployee(employee);
    }

    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@RequestBody Employee employee, @PathVariable Long id) {
        return employeeLogic.updateEmployee(employee, id);
    }

    @DeleteMapping("/employee/{id}")
    public Employee removeEmployee(@PathVariable Long id) {
        return employeeLogic.removeEmployee(id);
    }
}
