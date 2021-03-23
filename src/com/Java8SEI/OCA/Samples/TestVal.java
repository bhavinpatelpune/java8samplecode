package com.Java8SEI.OCA.Samples;

public class TestVal {
	
	int x,y;
	
	public TestVal(int x, int y){
		initialize(x,y);
	}
	
	public void initialize(int x, int y){
		this.x = x * x;
		this.y = y * y;
	}

	public static void main(String[] args) {

		int x = 3, y = 5;
		TestVal obj = new TestVal(x,y);
		System.out.println(x + " " + y); //3 5
		
		System.out.println("-----------------");
		
		int xx = 1;
		int yy = 0;
		
		if(xx++ > ++yy){
			System.out.println("Hello ");
		} else {
			System.out.println("Welcome ");
		}
			System.out.println(" Log " + xx + " : " + yy);  // Welcome  Log 2 : 1
			
			
		System.out.println("-----------------");
		
		int xxx = 1;
		int yyy = 1;
		
		if(xxx++ < ++yyy){
			System.out.println("Hello ");
		} else {
			System.out.println("Welcome ");
		}
			System.out.println(" Log " + xxx + " : " + yyy);  // Hello	 Log 2 : 2			
			
		System.out.println("-----------------");
			
			int [][] arr = new int[2][4];
			arr[0] = new int [] {1,3,5,7};
			arr[1] = new int [] {1,3};
			
//			for (int[] a: arr){
//				for(int i: a){
//					System.out.println(i + "");
//				}
//				System.out.println();   // OP: 1357 13
				
			for (int[] a: arr){
				for(int i=0; i<arr.length;i++){
					System.out.println(a[i] + " "); // 13 13 
				}
			}			
	}

}
