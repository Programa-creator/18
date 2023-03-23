package org.example.five;

import org.example.five.Product;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import static org.example.five.Product.calculateTotalCost;


public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Book", 50, true, LocalDate.of(2023, 3, 15)));
        products.add(new Product("Book", 80, false, LocalDate.of(2021, 5, 20)));
        products.add(new Product("Book", 60, true, LocalDate.of(2023, 12, 30)));
        products.add(new Product("CD", 20, false, LocalDate.of(2022, 4, 1)));

        System.out.println(calculateTotalCost(products)); // 45.0
    }
}

