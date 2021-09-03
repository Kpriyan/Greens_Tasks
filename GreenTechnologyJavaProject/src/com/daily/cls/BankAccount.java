package com.daily.cls;

public class BankAccount {
	
	Long accountNumber= 1234567890l;
	
	String holderName= "vino";
	
	Integer accountBalance= 350;
	
	
	public void getBalance() {
		
		System.out.println("the Balance is"+accountBalance);
		
	  }
	

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		account.getBalance();
		

	}

}
