package com.myDemo.Sample;

public class RecursiveFactorialNum {

	public static int factorialCalc(int n){
		if(n == 1){
			return 1;	
		}
		else {
			return (n * factorialCalc(n-1));
		}
	}
	
	public static void main(String[] args) {
		// 3 * 2 * 1 = 6
		System.out.println("Factorial Calc Using Recursive : " + factorialCalc(3));
	}

}
