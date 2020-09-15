package com.example.portsandadapters.domain.model.customer;

import com.example.portsandadapters.domain.contract.Entity;

import java.util.Date;

public class CreditCard implements Entity {

    private final int number;

    private final Date expiryDate;

    public CreditCard(int number, Date expiryDate) {

        this.number = number;
        this.expiryDate = expiryDate;
    }

    public int getLastFourDigits() {

        return number % 1000;

    }

    public int getNumber() {

        return number;
    }

    public Date getExpiryDate() {

        return expiryDate;
    }

}
