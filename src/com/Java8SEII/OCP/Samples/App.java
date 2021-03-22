package com.Java8SEII.OCP.Samples;

public class App {
	public static void main(String[] args) {
		Customers c1 = new Customers("Larry", "Smith");
		Customers c2 = new Customers("Pedro", "Gonzales");
		Customers c3 = new Customers("Penny", "Jones");
		Customers c4 = new Customers("Lars", "Svenson");
		c4 = null;
		c3 = c2;
		System.out.println(Customers.getCount());  //4
	}
}