package org.example.one;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Book", 300));
        productList.add(new Product("Book", 200));
        productList.add(new Product("Pen", 5));
        productList.add(new Product("Book", 400));

        List<Product> filteredList = productList.stream()
                .filter(product -> product.getType().equals("Book") && product.getPrice() > 250)
                .collect(Collectors.toList());

        System.out.println(filteredList);
    }
}
