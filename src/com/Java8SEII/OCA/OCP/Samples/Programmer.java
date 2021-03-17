package com.Java8SEII.OCA.OCP.Samples;

public class Programmer extends Writer {
	public static void write() {
		System.out.println("Writing code");
	}

	public static void main(String[] args) {
		Writer w = new Programmer();
		w.write();
	}
}
