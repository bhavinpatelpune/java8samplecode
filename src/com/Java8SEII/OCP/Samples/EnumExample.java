package com.Java8SEII.OCP.Samples;

public class EnumExample {
	public static void main (String[] args) { 
		USCurrency usCoin = USCurrency.DIME;
		System.out.println(usCoin.getValue());
	}
}