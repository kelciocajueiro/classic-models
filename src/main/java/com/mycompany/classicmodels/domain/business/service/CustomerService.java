package com.mycompany.classicmodels.domain.business.service;

import com.mycompany.classicmodels.domain.business.mapper.CustomerMapper;
import com.mycompany.classicmodels.domain.business.predicates.CustomerPredicates;
import com.mycompany.classicmodels.domain.model.entity.Customer;
import com.mycompany.classicmodels.domain.repository.CustomerRepository;
import com.mycompany.classicmodels.spi.dto.CustomerDto;
import com.mycompany.classicmodels.spi.search.CustomerSearchCriteria;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public long count(CustomerSearchCriteria criteria) {
        return repository.count(buildQuery(criteria));
    }

    public List<CustomerDto> find(Pageable pageable, CustomerSearchCriteria criteria) {

        Page<Customer> page = repository.findAll(buildQuery(criteria), pageable);

        return mapDtos(page.getContent());
    }

    private Predicate buildQuery(CustomerSearchCriteria criteria) {

        BooleanBuilder queryBuilder = new BooleanBuilder();

        if (criteria.hasValidName()) {
            queryBuilder.and(CustomerPredicates.nameContains(criteria.getName()));
        }

        if (criteria.hasValidContactName()) {
            queryBuilder.and(CustomerPredicates.contactNameContains(criteria.getContactName()));
        }

        if (criteria.hasValidPhone()) {
            queryBuilder.and(CustomerPredicates.phoneContains(criteria.getPhone()));
        }

        if (criteria.hasValidCreditLimit()) {
            queryBuilder.and(CustomerPredicates.creditLimitEquals(criteria.getCreditLimit()));
        }

        if (criteria.hasValidSalesRepresentative()) {
            queryBuilder.and(CustomerPredicates.salesRepresentativeContains(criteria.getSalesRepresentative()));
        }

        return queryBuilder;

    }

    private List<CustomerDto> mapDtos(List<Customer> customers) {

        CustomerMapper mapper = CustomerMapper.INSTANCE;

        List<CustomerDto> result = new ArrayList<>();

        customers.forEach(customer -> result.add(mapper.toCustomerDto(customer)));

        return result;

    }

}
