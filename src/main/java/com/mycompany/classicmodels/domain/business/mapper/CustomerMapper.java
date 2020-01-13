package com.mycompany.classicmodels.domain.business.mapper;

import com.mycompany.classicmodels.domain.model.entity.Customer;
import com.mycompany.classicmodels.spi.dto.CustomerDto;
import org.mapstruct.Mapper;

@Mapper(uses = { AddressMapper.class, EmployeeMapper.class })
public interface CustomerMapper {

    CustomerDto toDto(Customer entity);

    Customer toEntity(CustomerDto dto);

}
