package com.example.demo.controller;

import com.example.demo.entities.Product;
import com.example.demo.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/getProducts")
    public ResponseEntity<List<Product>> getProducts() {
        System.out.println("------------------------------llamadoooooooooooooooooooo");
        return ResponseEntity.ok(productService.getProducts());
    }

    @GetMapping("/generateProducts")
    public void generateProducts() {
        System.out.println("generando productos");
        this.productService.generateProducts();
    }

    @PostMapping("/createProduct")
    public Product createProduct(@RequestBody Product product) {
        return this.productService.createProduct(product);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProduct(@PathVariable int id) {
        System.out.println("removiendo producto");
        this.productService.deleteProduct(id);
    }
}
