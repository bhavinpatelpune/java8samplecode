package com.Java8SEII.OCP.Samples;

public class Customers {
	private String fName;
	private String lName;
	private static int count;

	public Customers(String first, String last) 
	{
		fName = first;
		lName = last;
		++count;
	}

	static {
		count = 0;
	}

	public static int getCount() {
		return count;
	}
}
