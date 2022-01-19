package com.ouassor.bank.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ouassor.bank.model.Transaction;
import com.ouassor.bank.service.AccountService;
import com.ouassor.bank.service.TransactionService;
import com.ouassor.bank.service.UserService;

@Controller
@RequestMapping("/api")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@Autowired
	private TransactionService transactionService;

	@RequestMapping(value = "/deposit", method = RequestMethod.POST)
	public String depositPOST(@ModelAttribute("amount") String amount, Principal principal) {
		accountService.deposit(Double.parseDouble(amount), principal);
		return "redirect:/userFront";
	}

	@RequestMapping(value = "/withdraw", method = RequestMethod.POST)
	public String withdrawPOST(@ModelAttribute("amount") String amount, Principal principal) {
		accountService.withdraw(Double.parseDouble(amount), principal);
		return "redirect:/userFront";
	}
	
    @RequestMapping(value = "/transaction", method = RequestMethod.GET)
    public List<Transaction> getTransactionList(@RequestParam("username") String username) {
        return transactionService.findTransactionList(username);
    }
}