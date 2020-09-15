package com.example.portsandadapters.adapter.out.persistence.jpa.customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerJpa, Long> {

    Iterable<CustomerJpa> findAll();

    Optional<CustomerJpa> findById(Long key);

    void delete(CustomerJpa entity);

    void deleteById(Long key);

}
