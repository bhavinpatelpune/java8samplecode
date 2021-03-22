package com.Java8SEII.OCP.Samples;

interface Interface1 {
	public default void sayHi(){
		System.out.println("Hi Interface-1");
	}
}

interface Interface2 {
	public default void sayHi(){
		System.out.println("Hi Interface-2");
	}
}

public class MyInterfaceClass implements Interface1, Interface2 {
	
	public void sayHi(){
		System.out.println("Hi MyClass");
	}

	public static void main(String[] args) {
		Interface1 obj = new MyInterfaceClass();
		obj.sayHi();  /// Hi MyClass
		
		Interface2 i1 = new MyInterfaceClass();
		i1.sayHi();  // Hi MyClass
		
	}
}
