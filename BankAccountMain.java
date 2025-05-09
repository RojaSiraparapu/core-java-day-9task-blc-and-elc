package com.blc.elc;

public class BankAccountMain {

	public static void main(String[] args) {
		
       BankAccount bankaccount=new BankAccount();
		
		bankaccount.setBankAccountDetails("Roja",12345,550000);
		String res=bankaccount.getBankAccountDetails();
				System.out.println(res);

	}

}
