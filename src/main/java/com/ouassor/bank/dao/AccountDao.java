package com.ouassor.bank.dao;

import org.springframework.data.repository.CrudRepository;

import com.ouassor.bank.model.Account;

public interface AccountDao extends CrudRepository<Account, Long> {

	Account findByAccountNumber(int accountNumber);
}
