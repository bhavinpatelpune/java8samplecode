package com.myDemo.Sample;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String size;
		int measurement = 3;
		switch(measurement){
		  case 3:
		    size = "S";
		  case 6:
		    size = "M";
		  case 9:
		    size = "L";
		    break;
		  default:
		    size = "X";
		}
		System.out.println(size);
	}

}
