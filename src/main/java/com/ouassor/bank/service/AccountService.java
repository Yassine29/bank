package com.ouassor.bank.service;

import java.security.Principal;

public interface AccountService {
	
	void deposit(double amount, Principal account);
	void withdraw(double amount, Principal account);

}
