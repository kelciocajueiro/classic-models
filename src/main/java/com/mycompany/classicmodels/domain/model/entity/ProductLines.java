package com.mycompany.classicmodels.domain.model.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@EqualsAndHashCode(of = "productLine")
@Entity
@Table(name = "productlines")
public class ProductLines {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Length(max = 50)
    @Column(unique = true, nullable = false, updatable = false)
    private String productLine;

    @NotBlank
    @Length(max = 4000)
    @Column(nullable = false, length = 4000)
    private String textDescription;

    @Column
    private String htmlDescription;

    @Lob
    @Column
    private byte[] image;

}
