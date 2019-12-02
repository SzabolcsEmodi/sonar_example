package com.epam.sonar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {
    private long id;
    private String firstName;
    private String lastName;
    private String address;
}
