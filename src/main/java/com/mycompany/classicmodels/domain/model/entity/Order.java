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
import java.time.LocalDate;
import java.util.List;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@EqualsAndHashCode(of = "number")
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Length(max = 11)
    @Column(name = "orderNumber", unique = true, nullable = false, updatable = false)
    private Long number;

    @NotBlank
    @Column(nullable = false)
    private LocalDate orderDate;

    @NotBlank
    @Column(nullable = false)
    private LocalDate requiredDate;

    @Column
    private LocalDate shippedDate;

    @NotBlank
    @Length(max = 15)
    @Column(nullable = false, length = 15)
    private String status;

    @Column
    private String comments;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "customerNumber")
    private Customer customer;

    @OneToMany(mappedBy = "id.order", fetch = EAGER)
    private List<OrderDetails> orderDetailsList;

}
