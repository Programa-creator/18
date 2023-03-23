package org.example.six;

import org.example.six.Product;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
        public static void main(String[] args) {
            // Створюємо список продуктів
            List<Product> products = new ArrayList<>();
            products.add(new Product(1, "футболка", 100.0, true, LocalDate.of(2021, 6, 1)));
            products.add(new Product(2, "шорти", 50.0, false, LocalDate.of(2021, 6, 2)));
            products.add(new Product(3, "футболка", 80.0, true, LocalDate.of(2021, 6, 3)));
            products.add(new Product(4, "штани", 120.0, false, LocalDate.of(2021, 6, 4)));
            products.add(new Product(5, "футболка", 90.0, true, LocalDate.of(2021, 6, 5)));

            // Групуємо продукти за типом
            Map<String, List<Product>> groupedProducts = products.stream()
                    .collect(Collectors.groupingBy(Product::getType));

            // Виводимо результат
            for (Map.Entry<String, List<Product>> entry : groupedProducts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
}

