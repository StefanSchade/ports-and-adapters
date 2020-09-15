package com.example.portsandadapters.domain.model.order;

import com.example.portsandadapters.domain.contract.AggregateRoot;
import com.example.portsandadapters.domain.contract.IdentifiedObject;

import java.util.List;

public class Order extends IdentifiedObject implements AggregateRoot {

  private String customerId;
  private String oderId;
  private List<LineItem> lineItems;
  private String shippingAddress;
  private String billingAddress;

  public Order(
      Long id,
      String customerId,
      String oderId,
      List<LineItem> lineItems,
      String shippingAddress,
      String billingAddress) {

    super(id);
    this.customerId = customerId;
    this.oderId = oderId;
    this.lineItems = lineItems;
    this.shippingAddress = shippingAddress;
    this.billingAddress = billingAddress;
  }
}
