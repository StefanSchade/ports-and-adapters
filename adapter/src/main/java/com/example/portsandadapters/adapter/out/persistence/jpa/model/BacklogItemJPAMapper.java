package com.example.portsandadapters.adapter.out.persistence.jpa.model;

import com.example.portsandadapters.domain.model.aggregate.sprint.BacklogItem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BacklogItemJPAMapper {

    BacklogItemJPAMapper INSTANCE = Mappers.getMapper(BacklogItemJPAMapper.class);

    BacklogItemJpa backlogItemDomainToJpa(BacklogItem source);

    BacklogItem backlogItemJpaToDomain(BacklogItemJpa source);

}
