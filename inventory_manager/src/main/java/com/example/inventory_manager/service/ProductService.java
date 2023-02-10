package com.example.inventory_manager.service;

import java.util.List;

import com.example.inventory_manager.entity.Product;

public interface ProductService {
    
    List<Product> getAllProducts();

    Product saveProduct(Product product);

    Product getProductById(int id);
    
    Product updateProduct(Product product);

    void deleteProductById(int id);
}
