package com.example.demo.service;

import com.example.demo.entities.Product;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductServiceTest {


    public ProductServiceTest(){}

    @Test
    public void queSePuedaCrearUnProducto(){
        ProductService productService = new ProductService();
        Product product2 = new Product(2,"pan",20);
        Product product = new Product();


        productService.createProduct(product2);
        productService.createProduct(product);

        assertEquals(2, productService.getProducts().size());

    }

    @Test
    public void queSePuedanEliminarTodosLosProductos(){
        ProductService productService = new ProductService();
        Product product2 = new Product(2,"pan",20);
        productService.createProduct(product2);
        productService.deleteAllProducts();

        assertEquals(0, productService.getProducts().size());
    }

    @Test
    public void queSePuedaObtenerProductos(){
        ProductService productService = new ProductService();
        Product product2 = new Product(2,"pan",20);
        productService.createProduct(product2);
        productService.getProducts();
        assertEquals("pan", productService.getProducts().get(0).getName());
    }
}
