package com.strings.questions;

public class FibonacciSeries {
	static int num1=0, num2=1, num3=0;
	
	
	static void showFibonacci(int pCnt){
		if(pCnt > 0){
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.println(" " + num3);
			
			showFibonacci(pCnt - 1);
		}
	}

	public static void main(String[] args) {
		int _cnt = 6;
		//  1 	 2 	 3 	 5 	 8 	 13
		showFibonacci(_cnt);
	}
}
