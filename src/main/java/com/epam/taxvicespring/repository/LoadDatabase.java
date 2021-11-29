package com.epam.taxvicespring.repository;

import com.epam.taxvicespring.entity.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    // private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    // @Bean
    // CommandLineRunner initDatabase(UserRepository repository) {
    //     return args -> {
    //         log.info("Preloading " + repository.save(new User(true, "login1", "", "name1", 10)));
    //         log.info("Preloading " + repository.save(new User(true, "login2", "", "name2", 20)));
    //     };
    // }
}