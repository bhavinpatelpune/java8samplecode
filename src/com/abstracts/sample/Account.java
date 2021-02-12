package com.abstracts.sample;

// Main Abstract class of Account
public abstract class Account {
	
	protected double balance;
	
	protected Account(double balance){
		this.balance = balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void deposit(double amount){
		balance += amount;
	}
	
	@Override
	public String toString(){
		return getDescription() + " : Current balance is - " + balance;
	}
	
	public abstract boolean withdrawn(double amount);
	
	public abstract String getDescription();

}
