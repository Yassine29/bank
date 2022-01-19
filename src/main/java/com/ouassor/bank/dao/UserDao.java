package com.ouassor.bank.dao;

import org.springframework.data.repository.CrudRepository;

import com.ouassor.bank.model.User;

public interface UserDao extends CrudRepository<User, Long> {

	User findByUsername(String username);

}
