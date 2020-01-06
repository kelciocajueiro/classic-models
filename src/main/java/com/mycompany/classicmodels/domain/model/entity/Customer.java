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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@EqualsAndHashCode(of = "number")
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Length(max = 11)
    @Column(name = "customerNumber", unique = true, nullable = false, updatable = false)
    private Long number;

    @NotBlank
    @Length(max = 50)
    @Column(name = "customerName", nullable = false, length = 50)
    private String name;

    @NotBlank
    @Length(max = 50)
    @Column(nullable = false, length = 50)
    private String contactFirstName;

    @NotBlank
    @Length(max = 50)
    @Column(nullable = false, length = 50)
    private String contactLastName;

    @NotBlank
    @Length(max = 50)
    @Column(nullable = false, length = 50)
    private String phone;

    @Embedded
    private Address address;

    @NotBlank
    @Length(max = 50)
    @Column(nullable = false, length = 50)
    private BigDecimal creditLimit;

    @ManyToOne
    @JoinColumn(name = "salesRepEmployeeNumber")
    private Employee salesRepresentative;

    @OneToMany(mappedBy = "id.customer")
    private List<Payment> paymentList;

    public String getContactFullName() {
        return String.format("%s %s", contactFirstName, contactLastName);
    }

}
