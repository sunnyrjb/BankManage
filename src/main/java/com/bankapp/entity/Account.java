package com.bankapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long account_number;
	@Column(name="Name of Account Holder")
	private String accont_holder_name;
	@Column(name="Balance")
	private Double account_balance;


	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String accont_holder_name, Double account_balance) {
		super();
		this.accont_holder_name = accont_holder_name;
		this.account_balance = account_balance;
	}
	public Long getAccount_number() {
		return account_number;
	}
	public void setAccount_number(Long account_number) {
		this.account_number = account_number;
	}
	public String getAccont_holder_name() {
		return accont_holder_name;
	}
	public void setAccont_holder_name(String accont_holder_name) {
		this.accont_holder_name = accont_holder_name;
	}
	public Double getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(Double account_balance) {
		this.account_balance = account_balance;
	}
	@Override
	public String toString() {
		return "Account [account_number=" + account_number + ", accont_holder_name=" + accont_holder_name
				+ ", account_balance=" + account_balance + "]";
	}



}
