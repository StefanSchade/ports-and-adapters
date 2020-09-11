package com.example.portsandadapters.adapter.out.persistence.jpa.repos;


import com.example.portsandadapters.adapter.out.persistence.jpa.model.SprintJpa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SprintRepository extends CrudRepository<SprintJpa, Long> {

    Iterable<SprintJpa> findAll();

}
