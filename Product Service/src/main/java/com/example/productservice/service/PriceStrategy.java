package com.example.productservice.service;

import com.example.productservice.model.Product;

public interface PriceStrategy {
    double calculatePrice(Product product);
}