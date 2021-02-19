package com.myDemo.Sample;

// A Simple Java program to demonstrate 
// method overriding in java 

// Base Class 
class Parent { 
	void show() 
	{ 
		System.out.println("BASE CLASS - Parent's show()"); 
	} 
} 

// Inherited class Child-1
class Child1 extends Parent { 
	// This method overrides show() of Parent --> OVERRIDING not mandatory until class is Abstract
	//@Override
	void show() 
	{ 
		System.out.println("CHILD CLASS - Child's-1 show()"); 
	} 
} 

//Inherited class Child-2
class Child2 extends Parent { 
	// This method overrides show() of Parent  --> OVERRIDING not mandatory until class is Abstract
	//@Override
	void show() 
	{ 
		System.out.println("CHILD CLASS - Child's-2 show()"); 
	} 
}

// Driver class 
class OverrideSample { 
	public static void main(String[] args) 
	{ 
		// If a Parent type reference refers 
		// to a Parent object, then Parent's 
		// show is called 
		Parent obj1 = new Parent(); 
		obj1.show(); 

		// If a Parent type reference refers 
		// to a Child object Child's show() 
		// is called. This is called RUN TIME 
		// POLYMORPHISM. 
		Parent obj11 = new Child1(); 
		obj11.show(); 
		
		Parent obj22 = new Child2(); 
		obj22.show(); 
		
		// If a direct child object created the child's show() will call
		Child1 obj3 = new Child1(); 
		obj3.show(); 
	} 
} 
