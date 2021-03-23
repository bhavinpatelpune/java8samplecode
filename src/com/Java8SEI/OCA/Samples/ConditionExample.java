package com.Java8SEI.OCA.Samples;

public class ConditionExample {

	public static void main(String[] args) {

		int x = 10;
		int y = ++x;
		int z = 0;
		
		if(y>=10 | y <=++x){
			z=x;
		}else{
			z=x++;
		}
		System.out.println(z); //12
		
		int a = 3;
		int b = 2;
		int c = 1;
		
		int r1 = a * b / c + 1;
		int r2 = a / b * c + 1;
		int r3 = a * ( b / (c + 1));
		System.out.println(r1 + " : " + r2 + " : " + r3 ); // 7 : 2 : 3
	}

}
