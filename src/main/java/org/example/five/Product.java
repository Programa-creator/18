package org.example.five;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Product {
    private String type;
    private double price;
    private boolean discount;
    private LocalDate dateAdded;

    public Product(String type, double price, boolean discount, LocalDate dateAdded) {
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.dateAdded = dateAdded;
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

    public static double calculateTotalCost(List<Product> products) {
        LocalDate currentYear = LocalDate.now().withDayOfYear(1);
        return products.stream()
                .filter(p -> p.getDateAdded().isAfter(currentYear))
                .filter(p -> p.getType().equals("Book"))
                .filter(p -> p.getPrice() <= 75)
                .mapToDouble(p -> p.isDiscount() ? p.getPrice() * 0.9 : p.getPrice())
                .sum();
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}

