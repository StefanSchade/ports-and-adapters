package com.example.portsandadapters.domain.model.product;

public class ProductBuilder {

  public static final int PRODUCT_ID_LENGTH = 20;

  private String name;
  private String description;
  private Double price;
  private String productId;
  private Long databaseId;
  private String identityOfPreviouslyCreatedObject;

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

  public ProductBuilder copyIdentityOfPreviouslyCreatedObject(String identityOfPreviouslyCreatedObject) {
    this.identityOfPreviouslyCreatedObject = identityOfPreviouslyCreatedObject;
    return this;
  }

  public Product build() {
    Product newProduct = new Product(productId, name, description, databaseId, identityOfPreviouslyCreatedObject);
    return newProduct;
  }
}
