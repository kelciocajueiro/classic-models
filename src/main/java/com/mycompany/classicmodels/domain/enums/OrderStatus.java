package com.mycompany.classicmodels.domain.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Objects;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum OrderStatus {

    CANCELLED("Cancelled"),
    DISPUTED("Disputed"),
    IN_PROCESS("In Process"),
    ON_HOLD("On Hold"),
    RESOLVED("Resolved"),
    SHIPPED("Shipped");

    @Getter
    private String description;

    public static OrderStatus value(String description) {
        return Arrays.asList(OrderStatus.values()).stream()
                .filter(value -> Objects.equals(value.getDescription(), description))
                .findFirst().orElse(null);
    }

}
