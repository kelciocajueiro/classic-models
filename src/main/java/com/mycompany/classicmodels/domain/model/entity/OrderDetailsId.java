package com.mycompany.classicmodels.domain.model.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
class OrderDetailsId implements Serializable {

    private static final long serialVersionUID = 5160080856546602657L;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "orderNumber", nullable = false)
    private Order order;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "productCode", nullable = false)
    private Product product;

}
