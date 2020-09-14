package com.example.portsandadapters.domain.model.customer;

import com.example.portsandadapters.domain.contract.AggregateRoot;
import com.example.portsandadapters.domain.contract.IdentifiedObject;

public class Customer extends IdentifiedObject implements AggregateRoot {

    private String firstName;
    private String surName;
    private String customerID;

    protected Customer(IdentifiedObjectBuilder<?, ?> b) {

        super(b);
    }

}
