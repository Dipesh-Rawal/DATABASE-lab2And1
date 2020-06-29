package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private int acountNumber;
	private int amount;
	private String date;

	protected Transaction() {
	}

	public Transaction(int acountNumber, int balance, String date) {
		this.acountNumber = acountNumber;
		this.amount = balance;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", acountNumber=" + acountNumber + ", amount=" + amount + ", date=" + date
				+ "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAcountNumber() {
		return acountNumber;
	}

	public void setAcountNumber(int acountNumber) {
		this.acountNumber = acountNumber;
	}


	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
