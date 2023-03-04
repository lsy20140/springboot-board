package com.example.demo.controller;

import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public String check() {
        return "welcome!";
    }

    @GetMapping("/users")
    public List<String> getAllUsers() {
        return userRepository.getAllUsers();
    }

}
