package com.myDemo.Sample;

//User-Defined Exceptions
//
//Sometimes, the built-in exceptions in Java are not able to describe a certain situation. 
//In such cases, user can also create exceptions which are called ‘user-defined Exceptions’. 
//Following steps are followed for the creation of user-defined Exception. 
// 
//
//The user should create an exception class as a subclass of Exception class. Since all the exceptions are subclasses of Exception 
//class, the user should also make his class a subclass of it. This is done as: 
// 
//class MyException extends Exception
// 
//We can write a default constructor in his own exception class. 
// 
//MyException(){}
// 
//We can also create a parameterized constructor with a string as a parameter. 
//We can use this to store exception details. We can call super class(Exception) constructor from this and send the string there. 
// 
//MyException(String str)
//{
//   super(str);
//}
// 
//To raise exception of user-defined type, we need to create an object to his exception class and throw it using throw clause, as: 
// 
//MyException me = new MyException(“Exception details”);
//throw me;
// 
// 
//
//The following program illustrates how to create own exception class MyException.
//Details of account numbers, customer names, and balance amounts are taken in the form of three arrays.
//In main() method, the details are displayed using a for-loop. At this time, check is done if in any account the balance amount 
//is less than the minimum balance amount to be apt in the account.
//If it is so, then MyException is raised and a message is displayed “Balance amount is less”.



public class ExceptionUserDefined extends Exception {
	
	//store account information
    private static int accno[] = {1001, 1002, 1003, 1004};	 
    private static String name[] = {"Bhavin", "Ram", "Krishna", "Laxman", "Bharat"};	 
    private static double bal[] = {10099.00, 12880.00, 2620.0, 9100.00, 654.55};
	
	// default constructor
	ExceptionUserDefined() {		
	}
 
    // Parameterized constructor to print string message
	ExceptionUserDefined(String str) {
		super(str); 
	}

	// Main method
	public static void main(String[] args) { 

		try  {
            // display the heading for the table
            System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");
 
            // display the actual account information
            for (int i = 0; i < 5 ; i++)
            {
                System.out.println(accno[i] + "\t" + name[i] + "\t" + bal[i]);
 
                // display own exception if balance < 1000
                if (bal[i] < 1000)
                {
                	ExceptionUserDefined me = new ExceptionUserDefined("Balance is less than 1000");
                    throw me;
                }
            }
        } //end of try 
        catch (ExceptionUserDefined e) {
            e.printStackTrace();
        }
	}

}
