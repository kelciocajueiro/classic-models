package com.mycompany.classicmodels.domain.model.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@EqualsAndHashCode(of = "number")
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Length(max = 11)
    @Column(name = "employeeNumber", unique = true, nullable = false, updatable = false)
    private Long number;

    @NotBlank
    @Length(max = 50)
    @Column(nullable = false, length = 50)
    private String firstName;

    @NotBlank
    @Length(max = 50)
    @Column(nullable = false, length = 50)
    private String lastName;

    @NotBlank
    @Length(max = 10)
    @Column(nullable = false, length = 10)
    private String extension;

    @Email
    @NotBlank
    @Length(max = 100)
    @Column(nullable = false, length = 100, unique = true)
    private String email;

    @NotBlank
    @Length(max = 50)
    @Column(nullable = false, length = 50)
    private String jobTitle;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "reportsTo")
    private Employee reportsTo;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "officeCode")
    private Office office;

    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }

}
