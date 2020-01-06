package com.mycompany.classicmodels.domain.model.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
class PaymentId implements Serializable {

    private static final long serialVersionUID = 1918665652698204645L;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "customerNumber", nullable = false)
    private Customer customer;

    @NotBlank
    @Length(max = 50)
    @Column(nullable = false, length = 50)
    private String checkNumber;

}
