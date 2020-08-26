package com.example.portsandadapters.adapter.out.persistence.jpa.model;

import com.example.portsandadapters.domain.model.aggregate.sprint.Sprint;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface SprintJpaMapper {

    SprintJpaMapper INSTANCE = Mappers.getMapper(SprintJpaMapper.class);

    SprintJpa sprintDomainToJpa(Sprint source);

    Sprint sprintJpaToDomain(SprintJpa source);

}
