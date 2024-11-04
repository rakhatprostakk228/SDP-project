package com.example.productservice.service;

import com.example.productservice.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product createProduct(Product product);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
    Product getProductById(Long id);

    double calculateProductPrice(Product product);
}