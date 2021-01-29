package com.myDemo.Sample;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MergeTwoArraySort {
	
	static void Method1(){
		int a[]={2,3,7};
		int b[]={4,5,8};
		
		int a1 = a.length;
		int b1 = b.length;
		int result = a1 + b1;
		
		int[] _res = new int[result];
		
		// using the pre-defined function arraycopy 
        System.arraycopy(a, 0, _res, 0, a1); 
        System.arraycopy(b, 0, _res, a1, b1); 
  
        // prints the resultant array 
        System.out.println(Arrays.toString(_res)); 
	}
	
	static void Method2(){
		// first array 
        int a[] = { 2,3,7 }; 
        // second array 
        int b[] = { 4,5,8 }; 
  
        // determining length of first array 
        int a1 = a.length; 
        // determining length of second array 
        int b1 = b.length; 
  
        // resultant array size 
        int c1 = a1 + b1; 
  
        // Creating a new array 
        int[] c = new int[c1]; 
  
        // Loop to store the elements of first 
        // array into resultant array 
        for (int i = 0; i < a1; i = i + 1) { 
            // Storing the elements in  
            // the resultant array 
            c[i] = a[i]; 
        } 
  
        // Loop to concat the elements of second  
        // array into resultant array 
        for (int i = 0; i < b1; i = i + 1) { 
  
            // Storing the elements in the  
            // resultant array 
            c[a1 + i] = b[i]; 
        } 
        
        // Loop to print the elements of  
        // resultant array after merging 
        for (int i = 0; i < c1; i = i + 1) { 
              
            // print the element 
            System.out.println(c[i]); 
        } 
	}
	
	static void Method3(){
		int[] arr1 = {2,3,7}; 
        int n1 = arr1.length; 
      
        int[] arr2 = {4,5,8}; 
        int n2 = arr2.length; 
      
        int[] arr3 = new int[n1+n2]; 
          
        mergeArrays(arr1, arr2, n1, n2, arr3); 
      
        System.out.println("Array after merging"); 
        for (int i=0; i < n1+n2; i++) 
            System.out.print(arr3[i] + " "); 
    } 
	
	// Merge arr1[0..n1-1] and arr2[0..n2-1]  
    // into arr3[0..n1+n2-1] 
    static void mergeArrays(int[] arr1, int[] arr2, int n1, 
                                int n2, int[] arr3) 
    { 
        int i = 0, j = 0, k = 0; 
      
        // Traverse both array 
        while (i<n1 && j <n2) 
        { 
            // Check if current element of first 
            // array is smaller than current element 
            // of second array. If yes, store first 
            // array element and increment first array 
            // index. Otherwise do same with second array 
            if (arr1[i] < arr2[j]) 
                arr3[k++] = arr1[i++]; 
            else
                arr3[k++] = arr2[j++]; 
        } 
      
        // Store remaining elements of first array 
        while (i < n1) 
            arr3[k++] = arr1[i++]; 
      
        // Store remaining elements of second array 
        while (j < n2) 
            arr3[k++] = arr2[j++]; 
    } 
    
    
   

	public static void main(String[] args) {
		Method1();
		Method2();
		Method3();
		
// Using Vanila Java script
//		function merge(){
//			  var a = [1,7,8];
//			  var b = [9,2,5];
//			  var c = a.concat(b);
//			  return c;
//			}
//			console.log(merge().sort());
	}

}
