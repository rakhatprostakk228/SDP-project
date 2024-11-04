package com.example.productservice.service;

import com.example.productservice.model.Product;

public interface ProductObserver {
    void update(Product product);
}