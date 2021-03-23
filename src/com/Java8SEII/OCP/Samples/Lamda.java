package com.Java8SEII.OCP.Samples;

interface P { public void method1();}
interface Q extends P { public void method2();}
interface R extends P { public void method2();}
interface S { public default void method(){}}
interface T { 
	public void method1();
	public void method2();
}
interface U {
	public void method1();
	public abstract void method2();
}

public class Lamda {
	P p = () -> {
	};
	
//	Q q = () -> {
//	};
//	
//	R r = () -> {
//	};
	
//	S s = () -> {
//	};
	
//	T t = () -> {
//	};
//	
//	U u = () -> {
//	};
	

}


//interface SalutationInterface { 
//	 public String sayHello(); 
//	} 
//
//	class LamdaSample { 
//
//	 // Driver code 
//	 public static void main(String[] args) 
//	 { 
//	     // Lambda Expression 
//	     SalutationInterface obj = () -> { 
//	         return "Hello-Bhavin!"; 
//	     }; 
//
//	     // Calling the above interface 
//	     System.out.println(obj.sayHello()); 
//	 } 
//	} 