package com.example.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Product> products;

    public Database() {
        products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 1200.00));
        products.add(new Product(2, "Phone", 800.00));
        products.add(new Product(3, "Headphones", 150.00));
    }

    public List<Product> getProducts() {
        return products;
    }
}