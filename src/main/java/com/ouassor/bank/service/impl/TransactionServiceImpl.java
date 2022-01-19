package com.ouassor.bank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ouassor.bank.dao.TransactionDao;
import com.ouassor.bank.model.Transaction;
import com.ouassor.bank.model.User;
import com.ouassor.bank.service.TransactionService;
import com.ouassor.bank.service.UserService;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private UserService userService;

	@Autowired
	private TransactionDao transactionDao;

	public List<Transaction> findTransactionList(String username) {
		User user = userService.findByUsername(username);
		List<Transaction> primaryTransactionList = user.getAccount().getTransactionList();

		return primaryTransactionList;
	}

	public void saveDepositTransaction(Transaction primaryTransaction) {
		transactionDao.save(primaryTransaction);
	}

	public void saveWithdrawTransaction(Transaction primaryTransaction) {
		transactionDao.save(primaryTransaction);
	}

}
