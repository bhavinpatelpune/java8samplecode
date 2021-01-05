package com.myDemo.Sample;

interface DemoInterface1  {  
	// Java-8 Feature -  to use default method to avoid ambiguity
	public default void display()   
	{  
		System.out.println("the display() method of DemoInterface1 invoked");  
	}  
}

interface DemoInterface2 {  
	public default void display()   
	{  
		System.out.println("the display() method of DemoInterface2 invoked");  
	}  
}

public class DimondDemo implements DemoInterface1, DemoInterface2 {  
	public void display()   
	{  
		DemoInterface1.super.display();  
		DemoInterface2.super.display();  
	}  
	public static void main(String args[])   
	{  
		DimondDemo obj = new DimondDemo();  
		obj.display();  
	}  
}  