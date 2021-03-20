package com.Java8SEI.OCA.Samples;

public class StaticExample {
	
	static int x = 20;
	static int xx=11;
	private int yy=33;
	
	public void method(int xx){
		xx=10;
		yy=12;
	}

	public static void main(String[] args) {

		StaticExample sobj = new StaticExample();
		sobj.x = 5;
		int y = x/sobj.x;
		System.out.println("y = " + y);  // OP: 1
/*We have defined static variable x with value 20, since it is static all instance of the class share same variable. 
 * So if any instance change value of x, that change will reflect on all instances. In this case changing value of x at line 5, 
 * so value of the variable x will be 5 for any instance. Hence the output would be y=1. So option C is correct.
*/
		
		System.out.println("-----------------");
		
		sobj.method(5);
		System.out.println(StaticExample.xx);  // OP: 11
		System.out.println("sobj.xx = " + sobj.xx);  // OP: 11
		System.out.println("sobj.yy = " + sobj.yy);  // OP: 12
/*Inside the call method only the instance variable “y” and the method argument “x” is changed. 
 * Here the static variable is shadowed by the argument variable “x”. 
 * Shadowing occurs when two variables are located in two different scopes with same name. In such case the closet scope variable is 
 * chosen. For example here, the call method changes the value of the argument “x” from 5 to 10 since the argument is in the local 
 * variable scope. So the static variable remains unchanged. Therefore the output will be 11 11 12.
*/

	}

}
