package com.example.inventory_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.inventory_manager.entity.Product;

public interface ProductRepository extends JpaRepository <Product, Integer> {
    
}
