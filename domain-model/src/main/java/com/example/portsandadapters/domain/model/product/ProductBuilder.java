package com.example.portsandadapters.domain.model.product;

import com.example.portsandadapters.domain.contract.utils.RandomUtil;

public class ProductBuilder {

  public static final int PRODUCT_ID_LENGTH = 20;

  private String name;
  private String description;
  private Double price;
  private String productId;
  private Long databaseId;

  public ProductBuilder name(String name) {
    this.name = name;
    return this;
  }

  public ProductBuilder description(String description) {
    this.description = description;
    return this;
  }

  public ProductBuilder price(Double price) {
    this.price = price;
    return this;
  }

  public ProductBuilder productId(String productId) {
    this.productId = productId;
    return this;
  }

  public Product build() {
    String productId = new RandomUtil().generateUserId(PRODUCT_ID_LENGTH);
    Product newProduct = new Product(name, description, productId, databaseId);
    return newProduct;
  }
}
