package org.example.two;

import org.example.two.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Book", 300, true));
        productList.add(new Product("Book", 200, false));
        productList.add(new Product("Pen", 5, true));
        productList.add(new Product("Book", 400, true));

        List<Product> filteredList = productList.stream()
                .filter(product -> product.getType().equals("Book") && product.isDiscountApplicable())
                .peek(Product::applyDiscount)
                .collect(Collectors.toList());

        System.out.println(filteredList);
    }
}
