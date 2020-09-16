package com.example.portsandadapters.domain.model.customer;

import java.util.Date;

public class CustomerBuilder {

  public static final int USER_ID_LENGTH = 20;

  private String firstName;
  private String lastName;
  private int creditCardNumber;
  private Date creditCardExpiryDate;
  private String preexistingCustomerID;
  private Long databaseId;

  public CustomerBuilder preexistingCustomerID(String preexistingCustomerID) {
    this.preexistingCustomerID = preexistingCustomerID;
    return this;
  }

  public CustomerBuilder databaseId(Long databaseId) {
    this.databaseId = databaseId;
    return this;
  }

  public CustomerBuilder firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public CustomerBuilder creditCardNumber(int creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
    return this;
  }

  public CustomerBuilder creditCardExpiryDate(Date creditCardExpiryDate) {
    this.creditCardExpiryDate = creditCardExpiryDate;
    return this;
  }

  public CustomerBuilder lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public Customer build() {
    Customer newCustomer;

    newCustomer =
        new Customer(this.firstName, this.lastName, this.databaseId, this.preexistingCustomerID);

    if (this.creditCardExpiryDate != null & this.creditCardNumber != 0) {
      CreditCardDetails card =
          new CreditCardDetails(this.creditCardNumber, this.creditCardExpiryDate);
      newCustomer.setCreditCardDetails(card);
    }

    return newCustomer;
  }
}