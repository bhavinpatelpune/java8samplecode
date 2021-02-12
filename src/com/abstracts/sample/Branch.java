package com.abstracts.sample;

public enum Branch {
	
	MUMBAI("Full"),
	PUNE("Loan"),
	DELHI("Full"),
	BANGALORE("Full");
	
	String serviceLevel;
	
	private Branch(String serviceLevel){
		this.serviceLevel = serviceLevel;
	}
	
	public String getServiceLevel(){
		return serviceLevel;
	}
	

}
