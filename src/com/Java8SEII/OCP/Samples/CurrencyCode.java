package com.Java8SEII.OCP.Samples;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyCode {

	public static void main(String[] args) {

		double d=15;
		Locale l = new Locale("en","US");
		NumberFormat formatter = NumberFormat.getCurrencyInstance(l);
		System.out.println(formatter.format(d));  // $15.00

	}

}
