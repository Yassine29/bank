package com.ouassor.bank.service;

import com.ouassor.bank.model.User;

public interface UserService {

	User findByUsername(String username);

}
