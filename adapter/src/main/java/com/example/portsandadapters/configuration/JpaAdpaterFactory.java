package com.example.portsandadapters.configuration;

import com.example.portsandadapters.adapter.out.persistence.jpa.JPAServiceSprintAggregate;
import com.example.portsandadapters.adapter.out.persistence.jpa.model.BacklogItemJPAMapper;
import com.example.portsandadapters.adapter.out.persistence.jpa.model.BacklogItemJpa;
import com.example.portsandadapters.adapter.out.persistence.jpa.model.SprintJpa;
import com.example.portsandadapters.domain.model.aggregate.sprint.Sprint;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

@NoArgsConstructor
public class JpaAdpaterFactory {

    @Autowired BacklogItemJPAMapper backlogItemJPAMapper;

    @Autowired CrudRepository<BacklogItemJpa, Long> bliRepo;

    @Autowired CrudRepository<SprintJpa, Long> sprintRepo;

    public JPAServiceSprintAggregate createSprintAggregateJPAService() {
        return new JPAServiceSprintAggregate<Sprint, Long>(bliRepo, sprintRepo, backlogItemJPAMapper);
    }
}
