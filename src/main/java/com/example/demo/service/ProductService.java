package com.example.demo.service;

import com.example.demo.entities.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products;

    public ProductService() {
        products = new ArrayList<Product>();
    }

    public List<Product> getProducts() {
        Product product = new Product(4,"maiz",25.99);
        products.add(product);

        return products;
    }

    public Product createProduct(Product product) {
        products.add(product);
        return product;
    }

    public void deleteAllProducts() {
        products.clear();
    }
}
