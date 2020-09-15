package com.example.portsandadapters.adapter.out.persistence.jpa.customer;

import com.example.portsandadapters.domain.model.customer.CreditCardDetails;
import com.example.portsandadapters.domain.model.customer.Customer;
import com.example.portsandadapters.domain.model.customer.CustomerBuilder;

public class CustomerMapper {

  CustomerJpa domainToJpa(Customer customer) {

    return domainToJpa(customer, customer.getCreditCardDetails());
  }

  CustomerJpa domainToJpa(Customer customer, CreditCardDetails creditCardDetails) {

    CustomerJpa customerJpa = new CustomerJpa();
    customerJpa.setCustomerId(customer.getCustomerId());
    customerJpa.setFirstName(customer.getFirstName());
    customerJpa.setLastName(customer.getLastName());
    if (customer.getCreditCardDetails() != null) {
      customerJpa.setCreditCardNumber(customer.getCreditCardDetails().getNumber());
      customerJpa.setCreditCardExpiryDate(customer.getCreditCardDetails().getExpiryDate());
    }
    return customerJpa;
  }

  Customer jpaToDomain(CustomerJpa customerJpa) {

    return new CustomerBuilder()
        .firstName(customerJpa.firstName)
        .lastName(customerJpa.lastName)
        .creditCardNumber(customerJpa.creditCardNumber)
        .creditCardExpiryDate(customerJpa.creditCardExpiryDate)
        .build();
  }
}
