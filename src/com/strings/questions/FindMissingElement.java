package com.strings.questions;

// How do you find the missing number in a given integer array of 1 to 100?
public class FindMissingElement {
	
	static void printMissingElement(int[] numbers,int totalelement)
	{
		int i=0;
		boolean missingElement;
		while(i<totalelement)
		{
			// initialized to true means element is missing.
			missingElement=true; 
			for(int j=0;j<numbers.length;j++) {
				// each array element with totalelement.
				if(totalelement==numbers[j]) {
					// means element is not missing.
					missingElement=false; 
				}
			}
			if(missingElement == true)	{
				System.out.println(totalelement);
			}
		  totalelement--;
		}
	}
	
	// getMissingNo function for 
	// finding missing number
	static int getMissingNo(int a[], int n)
	{
	    int n_elements_sum = n * (n + 1) / 2;
	    int sum = 0;
	 
	    for(int i = 0; i < n - 1; i++)
	        sum += a[i];
	         
	    return n_elements_sum - sum;
	}

	public static void main(String[] args) {
		// Integer Array
		int elements[] = {2,4,7,5};
		// passing array element and total element.
		printMissingElement(elements,4);
		
		// Integer Array
		int a[] = {2,4,7,5};
		int n = a.length + 1;
	    int miss = getMissingNo(a, n);
	     
	    System.out.print(miss);
	}

}
