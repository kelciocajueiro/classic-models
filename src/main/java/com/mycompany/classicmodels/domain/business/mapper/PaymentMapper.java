package com.mycompany.classicmodels.domain.business.mapper;

import com.mycompany.classicmodels.domain.model.entity.Payment;
import com.mycompany.classicmodels.spi.dto.PaymentDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = CustomerMapper.class)
public interface PaymentMapper {

    @Mapping(source = "id.checkNumber", target = "checkNumber")
    @Mapping(source = "id.customer", target = "customerDto")
    PaymentDto toDto(Payment entity);

    Payment toEntity(PaymentDto dto);

}
