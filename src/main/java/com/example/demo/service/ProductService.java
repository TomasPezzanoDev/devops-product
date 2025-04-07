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
        return products;
    }

    public void generateProducts() {
        this.products.add(new Product(1,"maiz",25.99));
        this.products.add(new Product(2,"pan",5.99));
        this.products.add(new Product(3,"agua",20.99));
        this.products.add(new Product(4,"cocacola",30.99));
        this.products.add(new Product(5,"pera",10.99));
        this.products.add(new Product(6,"banana",3.99));
        this.products.add(new Product(7,"manzana",8.99));
    }

    public Product createProduct(Product product) {
        products.add(product);
        return product;
    }

    public void deleteAllProducts() {
        products.clear();
    }

    public void deleteProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
            }
        }
    }
}
