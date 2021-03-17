package com.strings.questions;

import java.util.ArrayList;
import java.util.List;

// E & Y -> Coding Interview question 
public class PalindromeString {
	
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("abcd");
		strList.add("dcba");
		strList.add("str");
		strList.add("xyz");
		strList.add("zyx");
		
		int length = strList.size();
		String rev;
		System.out.println(length);
		System.out.println(strList.toString());
		System.out.println(strList.toArray());
		
		for(int i=length-1; i>=0; i--){
			//rev = rev + strList.toString();
			//System.out.println(strList.toString());
		}
		 
//	    for ( int i = length - 1; i >= 0; i-- )
//	       rev = rev + str.charAt(i);
//
//	    if (str.equals(rev))
//	       System.out.println(str+" is a palindrome");
//	    else
//	       System.out.println(str+" is not a palindrome");
		
		
		
//		// Palindrome.java
//		package com.jdojo.string;
//		public class Palindrome {
//		public static void main(String[] args) {
//		String str1 = "hello";
//		boolean b1 = Palindrome.isPalindrome(str1);
//		System.out.println(str1 + " is a palindrome: " + b1 );
//		String str2 = "noon";
//		boolean b2 = Palindrome.isPalindrome(str2);
//		System.out.println(str2 + " is a palindrome: " + b2 );
//		}
//		public static boolean isPalindrome(String inputString) {
//		// Check for null argument.
//		if (inputString == null) {
//		throw new IllegalArgumentException("String cannot be null.");
//		}
//		// Get the length of string
//		int len = inputString.length();
//		// In case of an empty string and one character strings,
//		// we do not need to do any comparisions.
//		// They are always palindromes.
//		www.it-ebooks.info
//		Chapter 11  Strings
//		404
//		if (len <= 1) {
//		return true;
//		}
//		// Convert the string into uppercase,
//		// so we can make the comparisons case insensitive
//		String newStr = inputString.toUpperCase();
//		// Initialize the result variable to true
//		boolean result = true;
//		// Get the number of comparisons to be done
//		int counter = len / 2;
//		// Do the comparison
//		for (int i = 0; i < counter; i++) {
//		if (newStr.charAt(i)!= newStr.charAt(len - 1 - i)) {
//		// It is not a palindrome
//		result = false;
//		// Exit the loop
//		break;
//		}
//		}
//		return result;
//		}
//		}


	}

}
