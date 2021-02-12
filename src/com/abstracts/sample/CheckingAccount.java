package com.abstracts.sample;

public class CheckingAccount extends Account {

	private final double overDraftLimit;
	
	public CheckingAccount(double balance, double overDraftLimit){
		super(balance);
		this.overDraftLimit = overDraftLimit;
	}
	
	public CheckingAccount(double balance){
		this(balance,0);
	}

	@Override
	public boolean withdrawn(double amount) {
		// TODO Auto-generated method stub
		if(amount <= balance + overDraftLimit){
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Checking Account : ";
	}
}
