package com.example.portsandadapters.adapter.out.persistence.jpa.model;

import com.example.portsandadapters.domain.model.customer.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerJpa domainToJpa(Customer source);

    Customer jpaToDomain(CustomerJpa source);

}
