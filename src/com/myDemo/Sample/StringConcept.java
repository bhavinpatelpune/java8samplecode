package com.myDemo.Sample;
// String Manipulation Concepts
// import java.io.*; 

public class StringConcept{
	public static void main(String args[])
	{
		String str;
		str="Bhavin";
		//System.out.println("HELLO - " + str);
		str="Patel";
		//System.out.println("HELLO - " + str);
		
		//Sum(1,2);
		//Sum(1,2,3);
		System.out.println("FORMAT - " + StringFormat("hello"));
		System.out.println("StringFormatReverse() - " + StringFormatReverse("hello"));
		System.out.println("StringFormatReverse1() - " + StringFormatReverse1("hello"));
		System.out.println("StringFormatReverse2() - " + StringFormatReverse2("hello"));
		
		ReverseTheWords("My Name is Bhavin");
		
		//display(null);
	}
	
	public static void display(Object ob){
		
	}
	
	public static void display(String ob){
			
		}
	
	public static void display(Integer ob){
		
	}
	
	public static void Sum(int a, int b){
		int c = a + b;
		System.out.println("SUM OF TWO VAL - " + c);
	}
	
	public static void Sum(int b, int a, int c){
		int d = a + b + c;
		System.out.println("SUM OF THREE VAL - " + d);
	}
	
	public static String StringFormat(String str){
		String words[]= str.split("\\s");  
	    String toggle="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        toggle+=first.toLowerCase()+afterfirst.toUpperCase()+" ";  
	    }  
	    return toggle.trim().toString();  
	}
	
	public static String StringFormatReverse(String str){
		String words[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    return reverseWord.trim()+"ay";   
	}
	
	public static String StringFormatReverse1(String str){
		String input = str;
		 
	    // getBytes() method to convert string
	    // into bytes[].
	    byte[] strAsByteArray = input.getBytes();

	    byte[] result = new byte[strAsByteArray.length];

	    // Store result in reverse order into the
	    // result byte[]
	    for (int i = 0; i < strAsByteArray.length; i++)
	        result[i] = strAsByteArray[strAsByteArray.length - i - 1];

	    //System.out.println(new String(result));
	    return new String(result);   
	}
	
	public static String StringFormatReverse2(String str){
		String input = str;
		 
	     StringBuilder input1 = new StringBuilder();

	     // append a string into StringBuilder input1
	     input1.append(input);

	     // reverse StringBuilder input1
	     input1 = input1.reverse();

	     // print reversed String
	     System.out.println(input1);

	    //System.out.println(new String(result));
	    return input1.toString();   
	}
	
	public static void ReverseTheWords(String str){
		String s[] = str.split(" ");
		String ans = "";
		for(int i = s.length - 1; i >= 0; i--) {
			ans += s[i] + " ";
		}
		System.out.println("Original String: " + str);
		System.out.println("Reversed String: " + ans.substring(0, ans.length() - 1));
	}
	 
	
	
	
}