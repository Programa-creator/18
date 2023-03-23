package org.example.three;

import org.example.three.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static Product getCheapestBook(List<Product> products) throws Exception {
        return products.stream()
                .filter(product -> product.getType().equalsIgnoreCase("Book"))
                .filter(Product::isDiscount)
                .min(Comparator.comparingDouble(Product::getPrice))
                .orElseThrow(() -> new Exception("Продукт [категорія: Book] не знайдено"));
    }
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Book", 100, true));
        products.add(new Product("Toy", 50, false));
        products.add(new Product("Book", 80, false));

        try {
            Product cheapestBook = getCheapestBook(products);
            System.out.println("Найдешевший продукт категорії Book: " + cheapestBook.getType() + ", " + cheapestBook.getPrice());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
