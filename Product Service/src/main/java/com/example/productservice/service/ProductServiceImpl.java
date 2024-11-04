package com.example.productservice.service;

import com.example.productservice.model.Product;
import com.example.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    private List<ProductObserver> observers = new ArrayList<>();
    private PriceStrategy priceStrategy;

    public void addObserver(ProductObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(Product product) {
        for (ProductObserver observer : observers) {
            observer.update(product);
        }
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product createProduct(Product product) {
        Product savedProduct = productRepository.save(product);
        notifyObservers(savedProduct);
        return savedProduct;
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        if (productRepository.existsById(id)) {
            product.setId(id);
            Product updatedProduct = productRepository.save(product);
            notifyObservers(updatedProduct);
            return updatedProduct;
        }
        return null;
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
        // Здесь можно уведомлять наблюдателей о удалении, если это необходимо
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public void setPriceStrategy(PriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    public double calculateProductPrice(Product product) {
        if (priceStrategy != null) {
            return priceStrategy.calculatePrice(product);
        }
        return product.getPrice();
    }
}