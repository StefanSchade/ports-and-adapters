package com.example.portsandadapters.adapter.out.persistence.jpa.repos;

import com.example.portsandadapters.adapter.out.persistence.jpa.model.BacklogItemJpa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BacklogItemRepository extends CrudRepository<BacklogItemJpa, Long> {

    Iterable<BacklogItemJpa> findAll();

}
