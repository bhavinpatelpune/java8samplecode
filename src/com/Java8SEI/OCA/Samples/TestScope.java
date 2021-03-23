package com.Java8SEI.OCA.Samples;

public class TestScope {
	
	static int doCalc(int var1){
		var1 = var1 * 2;
		return var1;
	}

	public static void main(String[] args) {
		int var1 = 200;
		System.out.print(doCalc(var1)); // 400
		System.out.print(" " + var1);   // 200
	}

}
