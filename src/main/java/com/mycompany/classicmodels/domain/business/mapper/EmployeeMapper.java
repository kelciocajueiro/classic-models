package com.mycompany.classicmodels.domain.business.mapper;

import com.mycompany.classicmodels.domain.model.entity.Employee;
import com.mycompany.classicmodels.spi.dto.EmployeeDto;
import org.mapstruct.Mapper;

@Mapper
public interface EmployeeMapper  {

    EmployeeDto toDto(Employee entity);

    Employee toEntity(EmployeeDto dto);

}
