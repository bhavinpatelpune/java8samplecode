package com.Java8SEI.OCA.Samples;

public class Datatypes {
	
	float flt1 = 100.00F;
	
	float flt2 = (float) 1_11.00;
	
//	Float flt3 = 100.00;  //Type mismatch: cannot convert from double to Float
	
	double y1 = 203.22;
//	float flt4 = y1;  //Type mismatch: cannot convert from double to float
	
	int y2 = 100;
	float flt5 = (float) y2 ;

	public static void main(String[] args) {

		int i = 10;
		int j = 20;
		int k = (j +=i) / 5;
		System.out.println(i + " : " + j + " : " + k); // 10 : 30 : 6
	}

}
