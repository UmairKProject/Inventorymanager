package com.example.inventory_manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.inventory_manager.entity.User;
import com.example.inventory_manager.service.UserService;

@Controller
public class UserController {

    private UserService userService;
    private String redirectString = "redirect:/users";;

    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }

    //handler method to display all users
    @GetMapping("/users")
    public String listUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }
    
    @GetMapping("/users/new")
    public String createUserForm(Model model) {
        // create product object to hold product form data
        User user = new User();
        model.addAttribute("user", user);
        return "create_user";
    }

    @PostMapping("/users")
    public String saveProduct(@ModelAttribute("product") User user) {
        userService.saveUser(user);
        return redirectString;
    }
}
