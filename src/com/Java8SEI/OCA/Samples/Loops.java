package com.Java8SEI.OCA.Samples;

public class Loops {

	public static void main(String[] args) {		
		
		int n[] = {1,2,3,4,5};
		
		for(int i:n){
			System.out.println(i);  // OP : 1,2,3,4,5
		}
		
		System.out.println("-----------------");
		
		int a1[][] = {{1,2,3,4} , {1,2,3}};
		for(int[] a:a1){
			int j=0;
			while(j<3){
				System.out.println(a[j]);
				j++;
			}
			System.out.println();    // OP : 123 123
		}
		
		System.out.println("-----------------");
		
		int [][] arr = new int[2][4];
		arr[0] = new int [] {1,2,3,4};
		arr[1] = new int [] {4,5};
		
		for (int[] a: arr){
			for(int i: a){
				System.out.println(i + "");
			}
			System.out.println();   // OP: 1234 45
		}
		
		System.out.println("-----------------");
		
		int num = 5;
		do{
			System.out.println(num--);
		} while(num==0);  // OP: 5
		
		
		System.out.println("-----------------");
		
		int ii = 0;
		int jj = 7;		
		for (ii = 0 ; ii < jj - 1; ii=ii+2){
			System.out.println(ii + " ");  // OP: 0 2 4
		}
		
		System.out.println("-----------------");
		
		int numarr[][]= new int[1][3];
		for(int i=0;i<numarr.length;i++){
			for(int j=0;j < numarr[i].length;j++){
				numarr[i][j] = 10;
				System.out.println(numarr[i][j]);  // OP: 10 10 10
			}
		}
		
	}

}
