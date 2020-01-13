package com.mycompany.classicmodels.domain.business.mapper;

import com.mycompany.classicmodels.domain.model.entity.Address;
import com.mycompany.classicmodels.spi.dto.AddressDto;
import org.mapstruct.Mapper;

@Mapper
public interface AddressMapper {

    AddressDto toDto(Address entity);

    Address toEntity(AddressDto dto);

}
