package com.example.portsandadapters.adapter.out.persistence.jpa;

import com.example.portsandadapters.domain.model.aggregate.sprint.Sprint;
import org.springframework.data.repository.CrudRepository;

//@Repository
public interface SprintRepository extends CrudRepository<Sprint, Long> {

    Iterable<Sprint> findAll();

}
