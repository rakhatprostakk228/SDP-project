package com.example.productservice.service;

import com.example.productservice.model.Product;

public class ConcreteObserver implements ProductObserver {
    @Override
    public void update(Product product) {
        System.out.println("Product updated: " + product.getName() + " with price: " + product.getPrice());
        // Здесь можно добавить логику для уведомлений, например, через email или сообщение.
    }
}