package com.example.portsandadapters.domain.model.customer;

import com.example.portsandadapters.domain.contract.AggregateRoot;
import com.example.portsandadapters.domain.contract.IdentifiedObject;

public class Customer extends IdentifiedObject implements AggregateRoot {

    private final String firstName;

    private final String lastName;

    private final String customerId;

    private CreditCard creditCard;

    protected Customer(String firstName, String lastName, String customerId, Long id) {

        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerId = customerId;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public String getCustomerId() {

        return customerId;
    }

    public CreditCard getCreditCard() {

        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {

        this.creditCard = creditCard;
    }

}