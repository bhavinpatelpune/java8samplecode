package com.Java8SEII.OCP.Samples;

public class MyClass implements AutoCloseable {
	int test;
	
	@Override
	public void close() throws Exception {	
	}
	
	public MyClass copyObject(){
		return this;
	}
	
	public static void main(String[] args) {
		MyClass obj = null;
//		try(MyClass obj1 = new MyClass()){ 
//			obj1.test = 100;
//			obj = obj1.copyObject(); //line1 - Unhandled exception type Exception thrown by automatic close() invocation on obj1
//		}
		System.out.println(obj.test);
	}
}
