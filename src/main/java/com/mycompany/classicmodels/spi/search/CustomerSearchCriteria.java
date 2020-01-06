package com.mycompany.classicmodels.spi.search;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class CustomerSearchCriteria {

    private String name;
    private String contactName;
    private String phone;
    private BigDecimal creditLimit;
    private String salesRepresentative;

    public boolean hasValidName() {
        return StringUtils.isNotBlank(name);
    }

    public boolean hasValidContactName() {
        return StringUtils.isNotBlank(contactName);
    }

    public boolean hasValidPhone() {
        return StringUtils.isNotBlank(phone);
    }

    public boolean hasValidCreditLimit() {
        return creditLimit != null;
    }

    public boolean hasValidSalesRepresentative() {
        return StringUtils.isNotBlank(salesRepresentative);
    }

}
