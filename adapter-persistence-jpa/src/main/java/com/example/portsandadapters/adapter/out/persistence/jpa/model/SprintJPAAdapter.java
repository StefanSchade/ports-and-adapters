package com.example.portsandadapters.adapter.out.persistence.jpa.model;

import com.example.portsandadapters.adapter.out.persistence.jpa.model.CustomerJpa;
import com.example.portsandadapters.adapter.out.persistence.jpa.model.CustomerMapper;
import com.example.portsandadapters.domain.model.customer.Customer;
import com.example.portsandadapters.port.repository.PersistenceAbstraction;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@NoArgsConstructor
public class SprintJPAAdapter implements PersistenceAbstraction<Customer, Long> {

    @Autowired CustomerMapper customerMapper;

    @Autowired CrudRepository<CustomerJpa, Long> customerRepo;

    @Override
    public Set<Customer> findAll() {
        return StreamSupport.stream(customerRepo.findAll()
                                                .spliterator(), false)
                            .map(customerMapper::jpaToDomain)
                            .collect(Collectors.toSet());
    }

    @Override
    public Customer findByID(Long key) {
        return customerMapper.jpaToDomain(customerRepo.findById(key)
                                                      .orElse(null));
    }

    @Override
    public void delete(Customer value) {
        // todo implement
    }

    @Override
    public Customer save(Customer value) {
        CustomerJpa returnValue = customerRepo.save(customerMapper.domainToJpa(value));
        return customerMapper.jpaToDomain(returnValue);
    }

    @Override
    public void deleteByID(Long key) {
        // todo implement
    }

}