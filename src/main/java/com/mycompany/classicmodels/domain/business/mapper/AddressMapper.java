package com.mycompany.classicmodels.domain.business.mapper;

import com.mycompany.classicmodels.domain.model.entity.Address;
import com.mycompany.classicmodels.spi.dto.AddressDto;
import org.mapstruct.Mapper;

@Mapper
public interface AddressMapper {

    AddressDto toAddressDto(Address address);

    Address toAddress(AddressDto dto);

}
