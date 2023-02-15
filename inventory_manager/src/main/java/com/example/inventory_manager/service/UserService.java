package com.example.inventory_manager.service;

import java.util.List;

import com.example.inventory_manager.entity.User;

public interface UserService {

    List<User> getAllUsers();

    User saveUser(User user);

    User getUserById(int id);

    User updateUser(User user);

    void deleteUserById(int id);
}
