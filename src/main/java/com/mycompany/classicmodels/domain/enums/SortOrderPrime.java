package com.mycompany.classicmodels.domain.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.primefaces.model.SortOrder;

import java.util.Arrays;
import java.util.Objects;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum SortOrderPrime {

    ASCENDING(SortOrder.ASCENDING, "asc"),
    DESCENDING(SortOrder.DESCENDING,"desc"),
    UNSORTED(SortOrder.UNSORTED, "");

    @Getter
    private SortOrder sortOrder;

    @Getter
    private String description;

    public static SortOrderPrime value(SortOrder sortOrder) {
        return Arrays.asList(SortOrderPrime.values()).stream()
                .filter(value -> Objects.equals(value.getSortOrder(), sortOrder))
                .findFirst().orElse(SortOrderPrime.UNSORTED);
    }

}
