package com.ouassor.bank.service.impl;

import java.math.BigDecimal;
import java.security.Principal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ouassor.bank.dao.AccountDao;
import com.ouassor.bank.model.Account;
import com.ouassor.bank.model.Transaction;
import com.ouassor.bank.model.User;
import com.ouassor.bank.service.AccountService;
import com.ouassor.bank.service.TransactionService;
import com.ouassor.bank.service.UserService;
import com.ouassor.bank.util.TransactionTypeEnum;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;

	@Autowired
	private TransactionService transactionService;
	
	@Autowired
	private UserService userService;

	public void deposit(double amount, Principal principal) {
		User user = userService.findByUsername(principal.getName());

		Account account = user.getAccount();
		account.setBalance(account.getBalance().add(new BigDecimal(amount)));
		accountDao.save(account);

		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		LocalDateTime date = LocalDateTime.of(currentDate, currentTime);

		Transaction transaction = new Transaction(date, TransactionTypeEnum.DEPOSIT.getDescription(), TransactionTypeEnum.DEPOSIT.getName(), amount,
				account.getBalance(), account);
		transactionService.saveDepositTransaction(transaction);

	}

	public void withdraw(double amount, Principal principal) {
		User user = userService.findByUsername(principal.getName());

		Account account = user.getAccount();
		account.setBalance(account.getBalance().subtract(new BigDecimal(amount)));
		accountDao.save(account);

		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		LocalDateTime date = LocalDateTime.of(currentDate, currentTime);

		Transaction transaction = new Transaction(date, TransactionTypeEnum.WITHDRAW.getDescription(), TransactionTypeEnum.WITHDRAW.getName(), amount,
				account.getBalance(), account);
		transactionService.saveWithdrawTransaction(transaction);

	}

}