package com.mycompany.classicmodels.spi.dto;

import com.mycompany.classicmodels.domain.model.entity.Office;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDTO {

    private Long number;
    private String firstName;
    private String lastName;
    private String extension;
    private String email;
    private String jobTitle;
    private EmployeeDTO reportsTo;
    private Office office;

    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }

}
