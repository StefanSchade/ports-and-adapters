package com.example.portsandadapters.domain.model.customer;

import com.example.portsandadapters.domain.contract.AggregateRoot;
import com.example.portsandadapters.domain.contract.IdentifiedObject;

public class Customer extends IdentifiedObject implements AggregateRoot {

  private final String firstName;
  private final String lastName;
  private CreditCardDetails creditCardDetails;

  protected Customer(String firstName, String lastName, Long id, String preExistingCustomerId) {
    super(id, preExistingCustomerId);
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getCustomerId() {
    return super.objectIdentifier;
  }

  public CreditCardDetails getCreditCardDetails() {
    return creditCardDetails;
  }

  public void setCreditCardDetails(CreditCardDetails creditCardDetails) {
    this.creditCardDetails = creditCardDetails;
  }
}
