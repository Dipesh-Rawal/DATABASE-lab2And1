package com.example.demo;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import com.example.demo.Account;
import com.example.demo.AccountDTO;
import com.example.demo.AccountMapper;
import com.example.demo.Address;
import com.example.demo.AddressDTO;
import com.example.demo.AddressMapper;
import com.example.demo.Customer;
import com.example.demo.CustomerDTO;
import com.example.demo.CustomerMapper;
import com.example.demo.Transaction;
import com.example.demo.TransactionDTO;
import com.example.demo.TransactionMapper;

public class Tests {

	private CustomerMapper customerMapper = Mappers.getMapper(CustomerMapper.class);
	private AccountMapper accountMapper = Mappers.getMapper(AccountMapper.class);
	private AddressMapper addressMapper = Mappers.getMapper(AddressMapper.class);
	private TransactionMapper transactionMapper = Mappers.getMapper(TransactionMapper.class);

	@Test
	public void CustomerTest() {
		Customer customer = new Customer("firstName","lastName");
		CustomerDTO customerDTO = customerMapper.customerToDTO(customer);

		assertEquals(customer.getFirstName(), customerDTO.getFirstName());
	}

	@Test
	public void AddressTest() {
		Address address = new Address();
		address.setCity("Wroclaw");
		AddressDTO addressDTO = addressMapper.addressToDTO(address);

		assertEquals(address.getCity(), addressDTO.getCity());
	}

	@Test
	public void AccountTest() {
		Account account = new Account();
		account.setAccountNumber(12457894);
		AccountDTO accountDTO = accountMapper.accountToDTO(account);

		assertEquals(account.getAccountNumber(), accountDTO.getAccountNumber());
	}

	@Test
	public void TransactionTest() {
		Transaction transaction = new Transaction();
		transaction.setAmount(9000);
		TransactionDTO transactionDTO = transactionMapper.transactionToDTO(transaction);

		assertEquals(transaction.getAmount(), transactionDTO.getAmount());
	}
}