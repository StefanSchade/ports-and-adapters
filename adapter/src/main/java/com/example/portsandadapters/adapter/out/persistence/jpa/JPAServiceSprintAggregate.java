package com.example.portsandadapters.adapter.out.persistence.jpa;

import com.example.portsandadapters.adapter.out.persistence.jpa.model.BacklogItemJpa;
import com.example.portsandadapters.adapter.out.persistence.jpa.model.BacklogItemJpaMapper;
import com.example.portsandadapters.adapter.out.persistence.jpa.model.SprintJpa;
import com.example.portsandadapters.adapter.out.persistence.jpa.model.SprintJpaMapper;
import com.example.portsandadapters.application.port.out.persistence.PersistenceAbstraction;
import com.example.portsandadapters.domain.model.aggregate.sprint.Sprint;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@NoArgsConstructor
public class JPAServiceSprintAggregate implements PersistenceAbstraction<Sprint, Long> {

    @Autowired BacklogItemJpaMapper backlogItemJPAMapper;

    @Autowired SprintJpaMapper sprintJpaMapper;

    @Autowired CrudRepository<BacklogItemJpa, Long> bliRepo;

    @Autowired CrudRepository<SprintJpa, Long> sprintRepo;

    public Set<Sprint> findAll() {
        StreamSupport.stream(sprintRepo.findAll().spliterator(), false)
                     .map(sprintJpaMapper::sprintJpaToDomain)
                     .collect(Collectors.toSet());
        return null;
    }

    public Sprint findByID(Long key) {
        return null;
    }

    public Sprint save(Sprint value) {
        return null;
    }

    public Sprint save(Long id, Sprint value) {
        return null;
    }

    public void delete(Sprint value) {
    }

    public void deleteByID(Long key) {
    }
}