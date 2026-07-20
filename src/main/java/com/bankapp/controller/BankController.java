package com.bankapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.entity.Account;
import com.bankapp.service.BankService;


@RestController
public class BankController {
	@Autowired
	BankService service;
	@PostMapping("/bank/add")
	public void createAccount(@RequestBody Account a) {
		service.add(a);
		
		}
	@GetMapping("/bank/getall")
	public List<Account> getall() {
		return service.getall();
		//return null;
	}
	
	@GetMapping("/bank/{id}")
	public Account getaccount(@PathVariable Long id) {
		return service.getindividualaccount(id);
		
	}
	@PutMapping("bank/deposit/{id}/{amount}")
	public void depositaccount(@PathVariable Long id, @PathVariable double amount) {
		service.deposit(id,amount);
		
	}
	@PutMapping("bank/withdarw/{id}/{amount}")
	public void withdrawaccount(@PathVariable Long id, @PathVariable double amount) {
		service.withdraw(id,amount);
		
	}
	
	

}
