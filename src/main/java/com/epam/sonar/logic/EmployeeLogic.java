package com.epam.sonar.logic;

import com.epam.sonar.database.EmployeeModel;
import com.epam.sonar.model.Employee;
import com.epam.sonar.model.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeLogic {
    @Autowired
    private EmployeeModel employeeModel;

    public Employee getEmployee(Long id) {
        return employeeModel.getEmployee(id).stream().findAny().orElse(null);
    }

    public Employee saveEmployee(Employee employee) {
        employeeModel.saveEmployee(employee);
        return employee;
    }

    public Employee updateEmployee(Employee employee, Long id) {
        return employeeModel.updateEmployee(employee, id);
    }

    public Employee removeEmployee(Long id) {
        return employeeModel.removeEmployee(id);
    }

    private EmployeeEntity convert(Employee employee) {
        return null;
    }

    private Employee convert(EmployeeEntity employeeEntity ) {
        return null;
    }
}
