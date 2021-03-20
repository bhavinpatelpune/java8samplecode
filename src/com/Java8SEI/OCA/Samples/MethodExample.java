package com.Java8SEI.OCA.Samples;

public class MethodExample {	
	int var;
	public void method(int x){
		var = x++;
	}

	public static void main(String[] args) {
		MethodExample m = new MethodExample();
		int n = 10;
		m.method(n);
		System.out.println(m.var);
		System.out.println(n); //OP : 10 10
	}

}
