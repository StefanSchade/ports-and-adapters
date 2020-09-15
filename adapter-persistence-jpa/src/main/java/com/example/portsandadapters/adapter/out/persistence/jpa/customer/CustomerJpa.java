package com.example.portsandadapters.adapter.out.persistence.jpa.customer;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Slf4j
@Data
@Entity
@NoArgsConstructor
public class CustomerJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column(nullable = false)
    @NonNull
    public String customerId;

    @Column(nullable = false)
    @NonNull
    public String firstName;

    @Column(nullable = false)
    @NonNull
    public String lastName;

    @Column(nullable = true) public int creditCardNumber;

    @Column(nullable = true) public Date creditCardExpiryDate;

}