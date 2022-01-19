package com.ouassor.bank.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ouassor.bank.model.Transaction;

public interface TransactionDao extends CrudRepository<Transaction, Long> {

	List<Transaction> findAll();
}
