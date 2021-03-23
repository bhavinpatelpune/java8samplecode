package com.Java8SEII.OCP.Samples;

public class ProductsMain {

	public static void main(String[] args) {

		Products p1 = new Products("PowerCharger");
		Products p2 = p1;
		System.out.println(p1.equals(p2)); //true
		Products p3 = new Products("PowerCharger");
		System.out.println(p1.equals(p3)); //false

	}

}
