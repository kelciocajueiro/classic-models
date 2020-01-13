package com.mycompany.classicmodels.spi.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class PaymentDto {

    private CustomerDto customerDto;
    private String checkNumber;
    private LocalDate paymentDate;
    private BigDecimal amount;

}
