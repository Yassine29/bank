package com.ouassor.bank.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ouassor.bank.dao.UserDao;
import com.ouassor.bank.model.User;
import com.ouassor.bank.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}

}
