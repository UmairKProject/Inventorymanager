package com.example.inventory_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.inventory_manager.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
