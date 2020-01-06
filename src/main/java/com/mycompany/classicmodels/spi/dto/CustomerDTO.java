package com.mycompany.classicmodels.spi.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class CustomerDTO {

    private Long number;
    private String name;
    private String contactFirstName;
    private String contactLastName;
    private String phone;
    private AddressDTO address;
    private BigDecimal creditLimit;

    public String getContactFullName() {
        return String.format("%s %s", contactFirstName, contactLastName);
    }

}
