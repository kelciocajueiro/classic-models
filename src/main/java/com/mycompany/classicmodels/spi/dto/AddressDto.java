package com.mycompany.classicmodels.spi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDto {

    private String firstAddressLine;
    private String secondAddressLine;
    private String city;
    private String state;
    private String postalCode;
    private String country;

}
