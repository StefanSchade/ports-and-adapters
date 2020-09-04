package com.example.portsandadapters.adapter.out.persistence.jpa.model;

import com.example.portsandadapters.domain.aggregate.one.GenericAggregateRoot001;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface SprintJpaMapper {

    SprintJpaMapper INSTANCE = Mappers.getMapper(SprintJpaMapper.class);

    SprintJpa sprintDomainToJpa(GenericAggregateRoot001 source);

    GenericAggregateRoot001 sprintJpaToDomain(SprintJpa source);

}
