package org.example.four;

import org.example.four.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", 500.0, true, LocalDate.now()));
        products.add(new Product("Laptop", 1000.0, false, LocalDate.now().minusDays(1)));
        products.add(new Product("TV", 800.0, true, LocalDate.now().minusDays(2)));
        products.add(new Product("Tablet", 300.0, true, LocalDate.now().minusDays(3)));
        products.add(new Product("Camera", 400.0, false, LocalDate.now().minusDays(4)));

        List<Product> lastThreeProducts = products.stream()
                .sorted((p1, p2) -> p1.getDateAdded().compareTo(p2.getDateAdded()))
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Last three added products:");
        lastThreeProducts.forEach(p -> System.out.println(p.getType()));
    }
}
