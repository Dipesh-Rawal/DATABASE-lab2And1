package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

	@Autowired
	private TransactionRepository transactionRepository;

	@GetMapping()
	public Iterable<Transaction> findAll() {
		return transactionRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Transaction findById(@PathVariable Long id) {
		return transactionRepository.findById(id).orElseThrow(IllegalArgumentException::new);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Transaction create(@RequestBody Transaction transaction) {
		return transactionRepository.save(transaction);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		transactionRepository.findById(id).orElseThrow(IllegalArgumentException::new);
		transactionRepository.deleteById(id);
	}

	@PutMapping("/{id}")
	public Transaction updateTransaction(@RequestBody Transaction transaction, @PathVariable Long id) {
		if (transaction.getId() != id) {
			throw new IllegalArgumentException();
		}
		transactionRepository.findById(id).orElseThrow(IllegalArgumentException::new);
		return transactionRepository.save(transaction);
	}
}

