package com.mycompany.classicmodels.infra.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Pages {

    LOGIN("/login.xhtml"),
    DASHBOARD("/html/dashboard.xhtml"),
    CUSTOMERS("/html/customers.xhtml"),
    EMPLOYEES("/html/employees.xhtml"),
    PRODUCTS("/html/products.xhtml"),
    OFFICES("/html/offices.xhtml"),
    ORDERS("/html/orders.xhtml"),
    PAYMENTS("/html/payments.xhtml"),
    DATA_DISCOVERY("/html/data-discovery.xhtml"),
    FAILURE("/login.xhtml?error=true");

    @Getter
    private String url;

}
