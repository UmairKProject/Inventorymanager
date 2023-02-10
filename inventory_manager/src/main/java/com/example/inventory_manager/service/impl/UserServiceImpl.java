package com.example.inventory_manager.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.inventory_manager.entity.User;
import com.example.inventory_manager.repository.UserRepository;
import com.example.inventory_manager.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        super();
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    
}
