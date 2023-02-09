package com.example.inventory_manager.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.inventory_manager.service.ProductService;
import com.example.inventory_manager.entity.Product;
import com.example.inventory_manager.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
    
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        super();
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
