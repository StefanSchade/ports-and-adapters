package com.example.portsandadapters.adapter.out.persistence.jpa.customer;

import com.example.portsandadapters.domain.model.customer.CreditCard;
import com.example.portsandadapters.domain.model.customer.Customer;
import com.example.portsandadapters.domain.model.customer.CustomerBuilder;

public class CustomerMapper {

    CustomerJpa domainToJpa(Customer customer) {

        return domainToJpa(customer, customer.getCreditCard());
    }

    CustomerJpa domainToJpa(Customer customer, CreditCard creditCard) {

        CustomerJpa customerJpa = new CustomerJpa();
        customerJpa.setCustomerId(customer.getCustomerId());
        customerJpa.setFirstName(customer.getFirstName());
        customerJpa.setLastName(customer.getLastName());
        customerJpa.setCreditCardNumber(customer.getCreditCard()
                                                .getNumber());
        customerJpa.setCreditCardExpiryDate(customer.getCreditCard()
                                                    .getExpiryDate());
        return customerJpa;

    }

    Customer jpaToDomain(CustomerJpa customerJpa) {

        return new CustomerBuilder().firstName(customerJpa.firstName)
                                    .lastName(customerJpa.lastName)
                                    .creditCardNumber(customerJpa.creditCardNumber)
                                    .creditCardExpiryDate(customerJpa.creditCardExpiryDate)
                                    .build();

    }

}
