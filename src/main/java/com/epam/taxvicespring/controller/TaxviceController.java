package com.epam.taxvicespring.controller;

import com.epam.taxvicespring.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxviceController {

    @Autowired
    UserRepository userRepository;

}
