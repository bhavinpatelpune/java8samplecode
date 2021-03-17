package com.Java8SEII.OCA.OCP.Samples;

public class SwitchExample {

	public static void main(String[] args) {
		
		String lang = "ENG";
		switch(lang){
			case "ENG":
				System.out.println("ENGLISH");
			case "FRE":
				System.out.println("FRENCH");
			case "JPN":
				System.out.println("JAPANISH");
		}
		
		System.out.println("-----------------");
		
		//boolean opt = true;
		//switch (opt) {  /// Cannot switch on a value of type boolean. Only convertible int values, strings or enum variables are
		
		String opt = "true";
		switch (opt){
		case "true":
			System.out.println("True");
			break;
		case "false":
			System.out.println("False");
			break;
		default:
			System.out.println("Default Done!");
		}

	}

}
