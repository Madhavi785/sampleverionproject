package com.verizon;

public class AccountDemo {
	public static void main(String args[]) {
		Account account=new Account();
		account.acNumber=101;
		account.name="Ram";
		account.balance=10000.00;
		System.out.println(account);
		System.out.println(account.acNumber +" "+account.name +" "+account.balance);
		
		Account account1 =new Account(123,"raj");
		System.out.println(account1);
		int ac;
		System.out.println(account1.acNumber +" "+ac);
	}

}
