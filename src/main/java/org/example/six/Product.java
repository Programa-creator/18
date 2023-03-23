package org.example.six;

import java.time.LocalDate;

public class Product {
    private int id;
    private String type;
    private double price;
    private boolean discount;
    private LocalDate dateAdded;

    public Product(int id, String type, double price, boolean discount, LocalDate dateAdded) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.dateAdded = dateAdded;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscount() {
        return discount;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}

