package com.strings.questions;

public class Palindrome {
	
	static int IsPalindromeNumber(int num){
		//find first reverse of n
		int reverse=0;
		for(int i=num; i>0; i/=10 ){
			reverse=reverse*10+i%10;
		}
		
		// if input num and reverse are same then num is palindrome
		return (num == reverse)?1:0;
	}
	
	static void numberCountfromMinMax(int min, int max){
		for (int i=min ; i<= max; i++){
			if(IsPalindromeNumber(i)==1){
				System.out.println(i+ " ");
			}
		}
	}

	public static void main(String[] args) {
		numberCountfromMinMax(10,100);
	}

}
