package com.blc.elc;

public class BankAccount {
	private String accountHolder;
	private int accountNumber;
	private double balance;

	public void setBankAccountDetails(String holder,int accNum,double bal)
	{
	 accountHolder=holder;
    accountNumber=accNum;
	balance=bal;
	
	}
	public String getBankAccountDetails() 
	{
		return "Account Holder:" + accountHolder +"\nAccount Number :" + accountNumber +"\nBalance :" + balance;
	
	}
}
	


	




