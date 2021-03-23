package com.Java8SEI.OCA.Samples;

public class TestArgs {
	
	public static final int MIN=1;

	public static void main(String[] args) {
		int x = args.length;
		System.out.println(args);
		System.out.println(args[0]);
		System.out.println(args.length);
		if(checkLimit(x)){
			System.out.println("Java SE");
		} else {
			System.out.println("Java EE");
		}
	}
	
	public static boolean checkLimit(int x){
		return (x>=MIN) ? true : false;
	}

}
