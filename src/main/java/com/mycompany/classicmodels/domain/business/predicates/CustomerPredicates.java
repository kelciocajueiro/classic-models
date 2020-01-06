package com.mycompany.classicmodels.domain.business.predicates;

import com.mycompany.classicmodels.domain.model.entity.QCustomer;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;

import java.math.BigDecimal;

public class CustomerPredicates {

    public static Predicate nameContains(String criteria) {
        return QCustomer.customer.name.containsIgnoreCase(criteria);
    }

    public static Predicate contactNameContains(String criteria) {

        QCustomer qCustomer = QCustomer.customer;

        Predicate contactFirstNameContains = qCustomer.contactFirstName.containsIgnoreCase(criteria);
        Predicate contactLastNameContains = qCustomer.contactLastName.containsIgnoreCase(criteria);

        return ((BooleanExpression) contactFirstNameContains).or(contactLastNameContains);
    }

    public static Predicate phoneContains(String criteria) {
        return QCustomer.customer.phone.containsIgnoreCase(criteria);
    }

    public static Predicate creditLimitEquals(BigDecimal criteria) {
        return QCustomer.customer.creditLimit.eq(criteria);
    }

    public static Predicate salesRepresentativeContains(String criteria) {

        QCustomer qCustomer = QCustomer.customer;

        Predicate firstNameContains = qCustomer.salesRepresentative.firstName.containsIgnoreCase(criteria);
        Predicate lastNameContains = qCustomer.salesRepresentative.lastName.containsIgnoreCase(criteria);

        return ((BooleanExpression) firstNameContains).or(lastNameContains);
    }

}
