package com.bankapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.entity.Account;
import com.bankapp.repo.BankRepo;

@Service
public class BankService {
	@Autowired
	BankRepo repo;

	public void add(Account a) {
		repo.save(a);
		
		// TODO Auto-generated method stub
		
	}

	public List<Account> getall() {
		return repo.findAll();
		
		// TODO Auto-generated method stub
		
	}

	public Account getindividualaccount(Long id) {
		return repo.findById(id).get();
		// TODO Auto-generated method stub
		
		
	}

	public void deposit(Long id, double amount) {
		// TODO Auto-generated method stub
		double a=repo.findById(id).get().getAccount_balance();
		repo.findById(id).get().setAccount_balance(a+amount);
		repo.save(repo.findById(id).get());
		
		
	}
	public void withdraw(Long id, double amount) {
		// TODO Auto-generated method stub
		double a=repo.findById(id).get().getAccount_balance();
		repo.findById(id).get().setAccount_balance(a-amount);
		repo.save(repo.findById(id).get());
		
		
	}

}
