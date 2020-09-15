package com.example.portsandadapters.adapter.out.persistence.jpa.customer;

import com.example.portsandadapters.domain.model.customer.Customer;
import com.example.portsandadapters.port.repository.Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
public class CustomerAdapter implements Repository<Customer, Long> {

    private final CustomerMapper customerMapper;

    private final CrudRepository<CustomerJpa, Long> customerRepository;

    @Override
    public Set<Customer> findAll() {

        return StreamSupport.stream(customerRepository.findAll()
                                                      .spliterator(), false)
                            .map(customerMapper::jpaToDomain)
                            .collect(Collectors.toSet());
    }

    @Override
    public Customer findByID(Long key) {

        return customerMapper.jpaToDomain(customerRepository.findById(key)
                                                            .orElse(null));
    }

    @Override
    public void delete(Customer customer) {

        customerRepository.delete(customerMapper.domainToJpa(customer));
    }

    @Override
    public Customer save(Customer customer) {

        CustomerJpa savedinstance = customerRepository.save(customerMapper.domainToJpa(customer));
        return customerMapper.jpaToDomain(savedinstance);

    }

    @Override
    public void deleteByID(Long key) {

        customerRepository.deleteById(key);
    }

}
