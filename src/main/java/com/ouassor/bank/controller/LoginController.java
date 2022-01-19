package com.ouassor.bank.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ouassor.bank.model.Account;
import com.ouassor.bank.model.User;
import com.ouassor.bank.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String home() {
		return "redirect:/index";
	}

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/login")
	public String login(Principal principal, Model model) {
		User user = userService.findByUsername(principal.getName());
		Account account = user.getAccount();
		model.addAttribute("account", account);
		return "ui";
	}
}