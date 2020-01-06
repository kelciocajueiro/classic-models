package com.mycompany.classicmodels.domain.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Embeddable
public class Address {

    @NotBlank
    @Length(max = 50)
    @Column(name = "addressLine1", nullable = false, length = 50)
    private String firstAddressLine;

    @Length(max = 50)
    @Column(name = "addressLine2", length = 50)
    private String secondAddressLine;

    @NotBlank
    @Length(max = 50)
    @Column(nullable = false, length = 50)
    private String city;

    @Length(max = 50)
    @Column
    private String state;

    @Length(max = 15)
    @Column
    private String postalCode;

    @NotBlank
    @Length(max = 50)
    @Column(nullable = false, length = 50)
    private String country;

}
