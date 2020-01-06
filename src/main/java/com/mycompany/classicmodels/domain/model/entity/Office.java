package com.mycompany.classicmodels.domain.model.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@EqualsAndHashCode(of = "code")
@Entity
@Table(name = "offices")
public class Office {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Length(max = 10)
    @Column(name = "officeCode", unique = true, nullable = false, updatable = false)
    private Long code;

    @NotBlank
    @Length(max = 50)
    @Column(nullable = false, length = 50)
    private String phone;

    @Embedded
    private Address address;

}
