package com.Java8SEII.OCA.OCP.Samples;

public class ScopeExample {

	static int x  = 11;
	private int y = 33;
	
	public void method(int x){
		x=10;
		y=12;
	}
	
	public static void main(String[] args) {
		ScopeExample s = new ScopeExample();
		s.method(5);
		System.out.println(ScopeExample.x); //11 
		System.out.println(s.x); //11
		System.out.println(s.y); //12
		
		/*Since inside the call method only the instance variable “y” and the method argument “x” is changed. 
		 * Here the static variable is shadowed by the argument variable “x”. Shadowing occurs when two 
		 * variables are located in two different scopes with same name. In such case the closet scope variable 
		 * is chosen. For example here, the call method changes the value of the argument “x” from 5 to 10 
		 * since the argument is in the local variable scope. So the static variable remains unchanged. 
		 * Therefore the output will be 11 11 12.
		 * */
		
//		int []args = new int[x]; //Duplicate local variable args
//		args[11] = 2;
//		for(int i: a){
//			System.out.println(i);
//		}
		
	}
}
