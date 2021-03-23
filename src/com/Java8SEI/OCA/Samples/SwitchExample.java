package com.Java8SEI.OCA.Samples;

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
		
		System.out.println("-----------------");
		
		Integer check = new Integer("1");
		switch (check){
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		default:
			System.out.println("Default Done!");
		}
		
		System.out.println("-----------------");
		
		int wd = 0; //-1 0 2 1
		String days[] = {"sun","mon","wed","sat"};
		for(String s: days){
			switch(s){
				case "sat":
				case "sun":
					wd -=1; 
					break;
				case "mon":
					wd++;
				case "wed":
					wd+=2;
			}
		}
		System.out.println(wd);  // 3

	}

}
