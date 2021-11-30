package com.epam.taxvicespring;

import java.util.List;

import com.epam.taxvicespring.entity.User;
import com.epam.taxvicespring.repository.UserRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.epam.taxvicespring")
public class TaxvicespringApplication {

	public static void main(String[] args) {
		System.out.println("");

        ConfigurableApplicationContext cac = SpringApplication.run(TaxvicespringApplication.class, args);

        for (String string : cac.getBeanDefinitionNames()) {
            System.err.println(string);
        }

        List<User> users = cac.getBean(UserRepository.class).findAll();

        System.out.println(users);
	}

}
