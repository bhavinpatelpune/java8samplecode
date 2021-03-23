package com.Java8SEII.OCP.Samples;

public class MyProducts {

	public double applyDiscount(double price){
		assert (price>0);
		return price * 0.50;
	}
	
	public static void main(String[] args) {

		MyProducts p = new MyProducts();
		double newprice = 
				p.applyDiscount(Double.parseDouble(args[0]));
		
		System.out.println("New Price: " + newprice); //New Price: 0.0
	}

}
