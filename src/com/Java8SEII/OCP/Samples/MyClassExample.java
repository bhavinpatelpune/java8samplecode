package com.Java8SEII.OCP.Samples;

interface Interface11{
	public default void sayHi(){
		System.out.println("Hi Interface-11");
	}
}

interface Interface22{
	public default void sayHi(){
		System.out.println("Hi Interface-22");
	}
}

public class MyClassExample implements  Interface11, Interface22 {

	public static void main(String[] args) {
		Interface11 obj = new MyClassExample();
		obj.sayHi(); //Hi My Class
	}

	public void sayHi(){
		System.out.println("Hi My Class");
	}
}
