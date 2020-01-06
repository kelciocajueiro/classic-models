package com.mycompany.classicmodels.web.primefaces;

import com.mycompany.classicmodels.domain.business.service.CustomerService;
import com.mycompany.classicmodels.spi.dto.CustomerDTO;
import com.mycompany.classicmodels.spi.search.CustomerSearchCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Component
public class CustomerLazyDataModel extends GenericLazyDataModel<CustomerDTO> {

    private static final long serialVersionUID = 1619255390843441197L;

    @Autowired
    private CustomerService service;

    @Override
    protected long count(Map<String, Object> filters) {
        return service.count(buildSearchCriteria(filters));
    }

    @Override
    protected List<CustomerDTO> fetch(Pageable pageable, Map<String, Object> filters) {
        return service.find(pageable, buildSearchCriteria(filters));
    }

    @Override
    public CustomerDTO getRowData(String rowKey) {
        return null;
        //return repository.getOne(Long.parseLong(rowKey)); TODO: Fix this
    }

    @Override
    public Object getRowKey(CustomerDTO customerDTO) {
        return customerDTO.getNumber();
    }

    private CustomerSearchCriteria buildSearchCriteria(Map<String, Object> filters) {

        CustomerSearchCriteria criteria = CustomerSearchCriteria.builder()
                .name((String) filters.get("name"))
                .contactName((String) filters.get("contactName"))
                .phone((String) filters.get("phone"))
                .creditLimit((BigDecimal) filters.get("creditLimit"))
                .salesRepresentative((String) filters.get("salesRepresentative"))
                .build();

        return criteria;

    }

}
