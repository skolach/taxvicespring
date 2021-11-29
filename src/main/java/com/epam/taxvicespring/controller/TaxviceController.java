package com.epam.taxvicespring.controller;

import java.util.List;
import java.util.Optional;

import com.epam.taxvicespring.entity.User;
import com.epam.taxvicespring.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxviceController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user")
    public List<User> allUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public Optional<User> oneUser(@PathVariable Integer id) {
        return userRepository.findById(id);
    }

}
