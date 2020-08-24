package com.example.portsandadapters.adapter.out.persistence.jpa;

import com.example.portsandadapters.domain.model.aggregate.sprint.BacklogItem;
import org.springframework.data.repository.CrudRepository;

//@Repository
public interface BacklogItemRepository extends CrudRepository<BacklogItem, Long> {

    Iterable<BacklogItem> findAll();

}
