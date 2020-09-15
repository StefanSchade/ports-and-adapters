package com.example.portsandadapters.domain.model.customer;

import java.security.SecureRandom;
import java.util.Date;
import java.util.Random;

public class CustomerBuilder {

    public static final int USERID_LENGTH = 20;

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

        String customerId = new RandomUtils().generateUserId(20);
        Customer newCustomer = new Customer(firstName, lastName, customerId, databaseId);
        if (this.creditCardExpiryDate!=null & this.creditCardNumber!=0) {
            CreditCard card = new CreditCard(this.creditCardNumber, this.creditCardExpiryDate);
            newCustomer.setCreditCard(card);
        }
        return newCustomer;
    }

    private class RandomUtils {

        private final Random RANDOM = new SecureRandom();

        private final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        public String generateUserId(int length) {

            return generateRandomString(length);
        }

        private String generateRandomString(int length) {

            StringBuilder returnValue = new StringBuilder(length);
            for (int i = 0;
                 i < length;
                 i++) {
                returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
            }

            return new String(returnValue);
        }

    }

}
