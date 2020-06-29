package com.example.demo;

import java.sql.Driver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
	private static final Logger log = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

	}

	@Bean
	public CommandLineRunner demo(CustomerRepository repository, AccountRepository accountRepository,
			AddressRepository addressRepository, TransactionRepository transactionRepository) {
		return (args) -> {

			Address address = new Address("US", "City", "Street", 5);
			addressRepository.save(address);

			Transaction transaction = new Transaction(12457894, 25, "02.03.2020");
			transactionRepository.save(transaction);

			Account account = new Account(12457894, "George", 140);
			accountRepository.save(account);

			Customer customer = new Customer("George", "Floyd");
			repository.save(customer);

		};
	}
}
