package com.mycompany.classicmodels.domain.business.mapper;

import com.mycompany.classicmodels.domain.model.entity.Customer;
import com.mycompany.classicmodels.spi.dto.CustomerDto;
import org.mapstruct.Mapper;

@Mapper(uses = AddressMapper.class)
public interface CustomerMapper {

    CustomerDto toCustomerDto(Customer customer);

    Customer toCustomer(CustomerDto dto);

}
