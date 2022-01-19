package com.ouassor.bank.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "transaction_id")
	private int id;
	@Column(name = "transaction_date")
	private LocalDateTime date;
	private String description;
	@Column(name = "transaction_type")
	private String type;
	private double amount;
	private BigDecimal availableBalance;
	
	@ManyToOne
	@JoinColumn(name = "account_id")
	private Account account;

	public Transaction() {

	}

	public Transaction(LocalDateTime date, String description, String type, double amount,
			BigDecimal availableBalance, Account account) {
		this.date = date;
		this.description = description;
		this.type = type;
		this.amount = amount;
		this.availableBalance = availableBalance;
		this.account = account;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public BigDecimal getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(BigDecimal availableBalance) {
		this.availableBalance = availableBalance;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}
