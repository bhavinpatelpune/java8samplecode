package com.Java8SEI.OCA.Samples;

abstract class Toy {
	int price;
	
	public static void insertToy(){
	}
	
	public int calculatePrice(){
		return price;
	}
	
	public abstract int computeDiscount();
	
	//This method requires a body instead of a semicolon	
//	public void printToy();
	
//Cannot instantiate the type Toy	
//	final Toy getToy(){
//		return new Toy(); 
//	}
}
