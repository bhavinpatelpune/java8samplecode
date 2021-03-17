package com.Java8SEII.OCA.OCP.Samples;

public abstract class AbstractClass {
	
	private int acctNo;
	
	public int getID(){
		return acctNo;
	}
	
	protected abstract double getBalance();  // MUST be implemented in subclass, bcs used abstract keyword
	public abstract void getList();	// MUST be implemented in subclass, bcs used abstract keyword

}
