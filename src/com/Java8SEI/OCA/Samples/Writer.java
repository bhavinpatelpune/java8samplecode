package com.Java8SEI.OCA.Samples;

abstract class Writer {
	public static void write() {
		System.out.println("Writing...");
	}
}

class Author extends Writer {
	public static void write() {
		System.out.println("Writing book");
	}
}


