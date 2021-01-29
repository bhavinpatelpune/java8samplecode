package com.myDemo.Sample;

// Regex pattern util package
import java.util.regex.Pattern;

public class ValidateEmail {
	
	public static boolean isEmailValidOrNot(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 

	public static void main(String[] args) {
		String email = "Hello123.com"; 
        if (isEmailValidOrNot(email)) 
            System.out.println("Valid Email!"); 
        else
            System.out.println("Invalid Email?");
	}

}
