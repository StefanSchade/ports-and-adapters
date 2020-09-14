package com.example.portsandadapters.domain.model.customer;

import com.example.portsandadapters.domain.contract.AggregateRoot;
import com.example.portsandadapters.domain.contract.IdentifiedObject;

public class Customer extends IdentifiedObject implements AggregateRoot {

    private String firstName;
    private String lastName;
    private String customerID;


}
