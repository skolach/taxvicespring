package com.epam.taxvicespring.controller;

import java.util.List;
import java.util.Optional;

import com.epam.taxvicespring.entity.User;
import com.epam.taxvicespring.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("")
    public List<User> allUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> oneUser(@PathVariable Integer id) {
        return userRepository.findById(id);
    }

    @PostMapping("")
    public User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

}
