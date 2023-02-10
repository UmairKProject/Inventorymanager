package com.example.inventory_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.inventory_manager.entity.Product;
import com.example.inventory_manager.entity.User;
import com.example.inventory_manager.repository.ProductRepository;
import com.example.inventory_manager.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class InventoryManagerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InventoryManagerApplication.class, args);
	}

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// User user1 = new User("test@gmail.com", "password");
		// userRepository.save(user1);
		
		// Product product1 = new Product("Cheap Coffee Beans", 2.50, "This is a bag of coffee beans.", 10);
		// productRepository.save(product1);

		// Product product2 = new Product("Expensive Coffee Beans", 14.50, "This is a bag of coffee beans.", 10);
		// productRepository.save(product2);

		// Product product3 = new Product("Mid Coffee Beans", 9.50, "This is a bag of coffee beans", 20);
		// productRepository.save(product3);
	}

}
