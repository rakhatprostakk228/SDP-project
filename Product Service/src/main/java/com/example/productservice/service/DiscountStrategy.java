package com.example.productservice.service;

import com.example.productservice.model.Product;

public class DiscountStrategy implements PriceStrategy {
    private final double discount;

    public DiscountStrategy(double discount) {
        this.discount = discount;
    }

    @Override
    public double calculatePrice(Product product) {
        return product.getPrice() - (product.getPrice() * discount);
    }
}