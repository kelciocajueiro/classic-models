package com.mycompany.classicmodels.spi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OfficeDTO {

    private Long code;
    private String phone;
    private AddressDTO address;

}
