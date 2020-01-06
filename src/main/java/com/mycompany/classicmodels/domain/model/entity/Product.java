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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@EqualsAndHashCode(of = "code")
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Length(max = 15)
    @Column(name = "productCode", unique = true, nullable = false, updatable = false)
    private String code;

    @NotBlank
    @Length(max = 70)
    @Column(name = "productName", nullable = false, length = 70)
    private String name;

    @NotBlank
    @Length(max = 10)
    @Column(name = "productScale", nullable = false, length = 10)
    private String scale;

    @NotBlank
    @Length(max = 50)
    @Column(name = "productVendor", nullable = false, length = 50)
    private String vendor;

    @NotBlank
    @Column(name = "productDescription", nullable = false)
    private String description;

    @NotBlank
    @Length(max = 6)
    @Column(nullable = false, length = 6)
    private Integer quantityInStock;

    @NotBlank
    @Column(nullable = false)
    private BigDecimal buyPrice;

    @NotBlank
    @Column(nullable = false)
    private BigDecimal MSRP;

    @ManyToOne
    @JoinColumn(name = "productLine")
    private ProductLines productLines;

    @OneToMany(mappedBy = "id.product")
    private List<OrderDetails> orderDetailsList;

}
