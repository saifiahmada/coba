package com.saifiahmada.vaadin.coba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.saifiahmada.vaadin.coba.entity.Customer;
import com.saifiahmada.vaadin.coba.repository.CustomerRepository;

@SpringBootApplication
public class CobaApplication {
	
	private static final Logger log = LoggerFactory.getLogger(CobaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CobaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner loadData(CustomerRepository repository) {
		return (args) -> {
			repository.save(new Customer("Saifi"));
			repository.save(new Customer("Ahmada"));
			repository.save(new Customer("Habibi"));
			
			for (Customer cust : repository.findAll()) {
				log.info("" + cust.toString());
			}
			
			
		};
	}

}

