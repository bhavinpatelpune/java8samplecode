package com.myDemo.Sample;

public abstract class AbstractDemo{
	private String _name;
	
	AbstractDemo(String s){
		this._name = s;
		System.out.println("HELLO " + this._name + " IM ABSTRACT!");
	}	
	
	public abstract void GetMyName();
}


interface TestInterface1  {
	String str1="Interface1";
	// Java-8 Feature -  to use default method to avoid ambiguity
	public default void display()   
	{  
		System.out.println("the display() method of TestInterface1 invoked");  
	}  
}

interface TestInterface2 {  
	String str2="Interface2";
	public default void display()   
	{  
		System.out.println("the display() method of TestInterface2 invoked");  
	}  
}

interface TestInterface3 extends TestInterface1, TestInterface2 {  
	String str3="Interface3";
	public default void display()   
	{  
		System.out.println("the display() method of TestInterface3 invoked");  
	}  
}

class AbstractTest extends AbstractDemo implements  TestInterface1, TestInterface2 {

	AbstractTest(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void GetMyName() {
		// TODO Auto-generated method stub
		
	}

	public void display()   
	{  
		TestInterface1.super.display();
		TestInterface2.super.display();
	} 
	
	
	public static void main(String args[]){
		AbstractTest at= new AbstractTest("BHAVIN");
		at.display();
		System.out.println(TestInterface1.str1);
		System.out.println(TestInterface2.str2);
	}

}

