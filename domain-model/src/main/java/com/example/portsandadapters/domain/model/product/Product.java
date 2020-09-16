package com.example.portsandadapters.domain.model.product;

import com.example.portsandadapters.domain.contract.AggregateRoot;
import com.example.portsandadapters.domain.contract.IdentifiedObject;

public class Product extends IdentifiedObject implements AggregateRoot {

  private String productId;
  private String name;
  private String description;
  private Double price;

  protected Product(String productId, String name, String description, Long databaseId, String objectIdentity) {
    super(databaseId, objectIdentity);
  }

}