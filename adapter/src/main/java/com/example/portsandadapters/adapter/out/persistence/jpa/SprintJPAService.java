package com.example.portsandadapters.adapter.out.persistence.jpa;

import com.example.portsandadapters.adapter.out.persistence.jpa.model.BacklogItemJpa;
import com.example.portsandadapters.adapter.out.persistence.jpa.model.BacklogItemJpaMapper;
import com.example.portsandadapters.adapter.out.persistence.jpa.model.SprintJpa;
import com.example.portsandadapters.adapter.out.persistence.jpa.model.SprintJpaMapper;
import com.example.portsandadapters.domain.aggregate.one.GenericAggregateRoot001;
import com.example.portsandadapters.ports.outbound.persistence.PersistenceAbstraction;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@NoArgsConstructor
public class SprintJPAService implements PersistenceAbstraction<GenericAggregateRoot001, Long> {

    @Autowired BacklogItemJpaMapper backlogItemJPAMapper;

    @Autowired SprintJpaMapper sprintJpaMapper;

    @Autowired CrudRepository<BacklogItemJpa, Long> bliRepo;

    @Autowired CrudRepository<SprintJpa, Long> sprintRepo;

    public Set<GenericAggregateRoot001> findAll() {
        return StreamSupport.stream(sprintRepo.findAll()
                                              .spliterator(), false)
                            .map(sprintJpaMapper::sprintJpaToDomain)
                            .collect(Collectors.toSet());
    }

    public GenericAggregateRoot001 findByID(Long key) {
        return sprintJpaMapper.sprintJpaToDomain(sprintRepo.findById(key)
                                                           .orElse(null));
    }

    public GenericAggregateRoot001 save(GenericAggregateRoot001 value) {
        SprintJpa savedvalue = sprintRepo.save(sprintJpaMapper.sprintDomainToJpa(value));
        return sprintJpaMapper.sprintJpaToDomain(savedvalue);
    }

    public GenericAggregateRoot001 save(Long id, GenericAggregateRoot001 value) {
        return null;
    }

    public void delete(GenericAggregateRoot001 value) {
    }

    public void deleteByID(Long key) {
    }
}