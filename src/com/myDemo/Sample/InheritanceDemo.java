package com.myDemo.Sample;
// import java.io.*;

class SuperBaseClass {	
	public void SuperMethod(){
	System.out.println("SuperMethod() - BASE - SUPER CLASS CALLED");
	}
}

class ChildClass extends SuperBaseClass{
	public void ChildMethod(){
		System.out.println("ChildMethod() in CHILD-CLASS CALLED");
		}
	
	//@Override
	public void SuperMethod(){
		System.out.println("SuperMethod() - CHILD - CLASS CALLED");
		}
}

public class InheritanceDemo {
	public static void main(String[] args)	{
		ChildClass cl = new ChildClass();
		cl.ChildMethod();
		cl.SuperMethod();
	}
}

/*
ChildMethod() in CHILD-CLASS CALLED
SuperMethod() - CHILD - CLASS CALLED
 */