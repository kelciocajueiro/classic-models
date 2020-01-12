package com.mycompany.classicmodels.spi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDto {

    private Long number;
    private String firstName;
    private String lastName;
    private String extension;
    private String email;
    private String jobTitle;
    private EmployeeDto reportsTo;
    private OfficeDto office;

    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }

}
