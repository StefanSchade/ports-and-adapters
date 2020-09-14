package com.example.portsandadapters.adapter.out.persistence.jpa.model;


import com.example.portsandadapters.adapter.out.persistence.jpa.model.CustomerJpa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerJpa, Long> {

    Iterable<CustomerJpa> findAll();

}
