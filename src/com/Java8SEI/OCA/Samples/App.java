package com.Java8SEI.OCA.Samples;

public class App {
	
	int count;
	public static void disp(){
//		count++; // Cannot make a static reference to the non-static field count
//		System.out.println("Welcome " + " Visited Count : " + count); //Cannot make a static reference to the non-static field count
	}

	public static void main(String[] args) {

		App.disp();
		App.disp();
	}

}
