package com.verizon;

public class Account {
	int acNumber;
	String name;
	double balance;
	Account(){
		acNumber=999;
		name="BankUser";
		balance=1000.00;
	}
	public Account(int acNumber, String name, double balance) {
		super();
		this.acNumber = acNumber;
		this.name = name;
		this.balance = balance;
	}
	Account(int acNumber, String name, double balance){
		this.acNumber=acNumber;
		this.name=name;
		this.balance=balance;
	}
	void deposit(int amt) {
		balance+=amt;
	}
    double withdraw(int amt) {
    	balance-=amt;
    	return balance;
    }
    double getBalance() {
    	return balance;
    }
    
}
