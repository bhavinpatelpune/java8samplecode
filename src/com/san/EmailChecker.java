package com.san;

import java.util.Scanner;

public class EmailChecker {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email id :");
		String mailId=sc.nextLine();
		String flag=isEmailValid(mailId);
		sc.close();
		System.out.println(flag);

	}
	
	static String isEmailValid(String mail){
		String regEx="^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$";
		if(mail.matches(regEx)){
			System.out.println(mail+" :Valid");
			return "Success";
		}
		else{
			System.out.println(mail+" :Invalid");
			return "Fail";
		}
		
	}

}
