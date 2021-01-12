package com.myDemo.Sample;

//Java program for the above approach
import java.io.*;
import java.util.*;

class StringCharFrontEnd{

//Function to find the minimum operations
//required to get the given string after
//appending m or n characters from the end
//to the front of the string in each operation
static void minimumOperations(String orig_str,
							int m, int n)
{
	
	// Store the original string
	String orig = orig_str;

	// Stores the count of operations
	int turn = 1;
	int j = 1;

	// Traverse the string
	for(int i = 0; i < orig_str.length(); i++)
	{
		
		// Cut m letters from end
		String m_cut = orig_str.substring(
			orig_str.length() - m);

		orig_str = orig_str.substring(
			0, orig_str.length() - m);

		// Add cut m letters to beginning
		orig_str = m_cut + orig_str;

		// Update j
		j = j + 1;

		// Check if strings are the same
		if (!orig.equals(orig_str))
		{
			turn = turn + 1;

			// Cut n letters from end
			String n_cut = orig_str.substring(
				orig_str.length() - n);
			orig_str = orig_str.substring(
				0, orig_str.length() - n);

			// Add cut n letters to beginning
			orig_str = n_cut + orig_str;

			// Update j
			j = j + 1;
		}

		// Check if strings are the same
		if (orig.equals(orig_str))
		{
			break;
		}

		// Update the turn
		turn = turn + 1;
	}
	System.out.println( turn );
}

//Driver Code
public static void main(String[] args)
{
	
	// Given string S
	String S = "BhavinPatelOracle";

	int X = 5, Y = 3;

	// Function Call
	minimumOperations(S, X, Y);
}
}
