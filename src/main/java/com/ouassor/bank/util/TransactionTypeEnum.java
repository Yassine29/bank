package com.ouassor.bank.util;

public enum TransactionTypeEnum {
	DEPOSIT(0, "Deposit", "Deposit to Primary Account"), 
	WITHDRAW(1, "Withdraw", "Withdraw from Account");

	private Integer position;
	private final String name;
	private final String description;

	private TransactionTypeEnum(Integer position, String name, String description) {
		this.name = name;
		this.position = position;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public Integer getPosition() {
		return position;
	}

	public String getDescription() {
		return description;
	}
}
