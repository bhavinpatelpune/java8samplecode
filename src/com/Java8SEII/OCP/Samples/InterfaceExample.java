package com.Java8SEII.OCP.Samples;

interface BaseI {
	void method();
}

class BaseC {
	public void method(){
		System.out.println("Inside BaseC::method");  // Inside BaseC::method
	}
}

public class InterfaceExample extends BaseC implements BaseI {

	public static void main(String[] args) {
		(new InterfaceExample()).method();
		
		try{
		Float f1=new Float("3.0");
		int x = f1.intValue();
		byte b = f1.byteValue();
		double d = f1.doubleValue();
		System.out.println(x + b + d);
		} catch (NumberFormatException e)
		{
			System.out.println("bad number");  // 9.0
		}
		
	}

}
