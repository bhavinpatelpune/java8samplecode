package com.Java8SEII.OCP.Samples;

class SuperClass{
	protected void method1(){
			System.out.print("M SuperC");
		}
	}

class SubClass extends SuperClass{
	//private void method1(){ //Cannot reduce the visibility of the inherited method from SuperClass
	protected void method1(){
		System.out.print("M SubC");
	}

	public static void main(String[] args){
		SubClass sc = new SubClass();
		sc.method1(); //M SubC
	}
}
