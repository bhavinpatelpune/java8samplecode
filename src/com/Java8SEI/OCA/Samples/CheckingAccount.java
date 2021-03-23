package com.Java8SEI.OCA.Samples;

public class CheckingAccount {
	
	public int amount;
	
// D	
//	public CheckingAccount(){
//		this.amount = 100;
//	}
	
// A	
//	public CheckingAccount(){
//		amount = 100;
//	}

	public static void main(String[] args) {
		CheckingAccount acct = new CheckingAccount();
		//amount = 100; WRONG
		//this.amount; WRONG
		acct.amount = 100; // E
		System.out.println(acct.amount);
		// A  D  E
	}

}
