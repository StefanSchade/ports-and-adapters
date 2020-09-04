package com.example.portsandadapters.adapter.out.persistence.jpa.model;

import com.example.portsandadapters.domain.aggregates.one.GenericEntity001;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BacklogItemJpaMapper {

    BacklogItemJpaMapper INSTANCE = Mappers.getMapper(BacklogItemJpaMapper.class);

    BacklogItemJpa backlogItemDomainToJpa(GenericEntity001 source);

    GenericEntity001 backlogItemJpaToDomain(BacklogItemJpa source);

}
