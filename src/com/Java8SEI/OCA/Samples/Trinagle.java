package com.Java8SEI.OCA.Samples;

public class Trinagle {
	
	static double area;
	int b = 2, h = 3;

	public static void main(String[] args) {
		double p, b, h;
			if(area == 0){
				b = 3;
				h = 4;
				p = 0.5;
				area = p * b * h;
			}
			System.out.println("Area is : " + area); // Area is : 6.0
	}

}
