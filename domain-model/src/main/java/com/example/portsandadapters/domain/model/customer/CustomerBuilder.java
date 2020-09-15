package com.example.portsandadapters.domain.model.customer;

import com.example.portsandadapters.domain.contract.utils.RandomUtil;

import java.util.Date;

public class CustomerBuilder {

  public static final int USER_ID_LENGTH = 20;

  private String firstName;
  private String lastName;
  private int creditCardNumber;
  private Date creditCardExpiryDate;
  private Long databaseId;

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
    String customerId = new RandomUtil().generateUserId(USER_ID_LENGTH);
    Customer newCustomer = new Customer(firstName, lastName, customerId, databaseId);
    if (this.creditCardExpiryDate != null & this.creditCardNumber != 0) {
      CreditCardDetails card =
          new CreditCardDetails(this.creditCardNumber, this.creditCardExpiryDate);
      newCustomer.setCreditCardDetails(card);
    }
    return newCustomer;
  }
}