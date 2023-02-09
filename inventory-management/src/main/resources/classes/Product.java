package com.example.inventorymanagement;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String productName, productDescription;
    private double price;

    public Product(){

    }

    public Product(long id, String productName, String productDescription, double price){
        super();
        this.id = id;
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
    }

    public long getId(){
        return id;
    }

    public String getProductName(){
        return productName;
    }       

    public String getProductDescription(){
        return productDescription;
    }

    public double getPrice(){
        return price;
    }

    public void setId(long id){
        this.id = id;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public void setProductDescription(String productDescription){
        this.productDescription = productDescription;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
