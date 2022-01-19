package com.ouassor.bank.service;

import java.util.List;

import com.ouassor.bank.model.Transaction;

public interface TransactionService {
	
	List<Transaction> findTransactionList(String username);

	void saveDepositTransaction(Transaction primaryTransaction);

	void saveWithdrawTransaction(Transaction primaryTransaction);

}