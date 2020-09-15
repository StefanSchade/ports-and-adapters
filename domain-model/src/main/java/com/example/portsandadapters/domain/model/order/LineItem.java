package com.example.portsandadapters.domain.model.order;

public class LineItem {

    private String name;
    private Integer quantity;
    private Double price;

    protected LineItem(String name, Integer quantity, Double price) {

        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

}
