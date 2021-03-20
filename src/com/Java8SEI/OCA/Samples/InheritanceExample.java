package com.Java8SEI.OCA.Samples;

class A {
	public A(){
		System.out.println("A");
	}
}

class B extends A {
	public B(){
		System.out.println("B");
	}
}


public class InheritanceExample extends B {
	
	public InheritanceExample(){
		System.out.println("C");
	}
	
	public static void main(String[] args) {
		InheritanceExample i = new InheritanceExample();
// OP:		
//		A
//		B
//		InheritanceExample
	}
}
