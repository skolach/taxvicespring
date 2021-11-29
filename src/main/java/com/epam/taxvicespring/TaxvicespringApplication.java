package com.epam.taxvicespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.epam.taxvicespring")
public class TaxvicespringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxvicespringApplication.class, args);
	}

}
