package com.mycompany.classicmodels.domain.model.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "orderdetails")
public class OrderDetails {

    @EmbeddedId
    private OrderDetailsId id;

    @NotBlank
    @Length(max = 11)
    @Column(nullable = false, length = 11)
    private Integer quantityOrdered;

    @NotBlank
    @Column(nullable = false)
    private BigDecimal priceEach;

    @NotBlank
    @Length(max = 6)
    @Column(nullable = false, length = 6)
    private Integer orderLineNumber;

}
