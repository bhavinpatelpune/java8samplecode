package com.san;

import java.util.Scanner;

public class SumOfPairs {

	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter total elements of array: ");
			int totalElements=sc.nextInt();
			 int a[] = new int[totalElements];
		        System.out.println("Enter all the elements:");
		        for(int i = 0; i < totalElements; i++)
		        {
		            a[i] = sc.nextInt();
		           
		        }
		        
			System.out.println("Enter pair sum value");
			int pairSum=sc.nextInt();
			pairNum(a,pairSum);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

		public static void pairNum(int[] a,int num){
			
			for(int i=0;i<a.length;i++){
				for(int j=i+1;j<a.length;j++){
					if(a[i]+a[j]==num){
						System.out.println("Pair Numbers are"+a[i]+", "+a[j]);
					}
				}
			}
			
		}
}
