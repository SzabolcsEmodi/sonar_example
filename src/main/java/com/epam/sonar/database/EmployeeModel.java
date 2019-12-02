package com.epam.sonar.database;

import com.epam.sonar.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeModel {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Employee> getEmployee(Long id) {
        String query = "select * from employee where id = '" + id + "'";
        return jdbcTemplate.queryForList(query, Employee.class);
    }

    public int saveEmployee(Employee employee) {
        String query = "insert into employee values ('" + employee.getFirstName() + "', '" + employee.getLastName() + "', '" + employee.getAddress() + "')";
        return jdbcTemplate.update(query);
    }

    public Employee updateEmployee(Employee employee, Long id) {
        String query = "update employee set firstName = '" + employee.getFirstName() + "'" +
                " and lastName = '" + employee.getLastName() + "'" +
                " and address = '" + employee.getAddress() + "'" +
                " where id='" + employee.getId() + "'";
        return null;
    }

    public Employee removeEmployee(Long id) {
        String query = "delete from employee where id = '" + id + "'";
        return null;
    }
}
