package com.Java8SEI.OCA.Samples;

public class MarksList {

	int num;
	public static void graceMarks(MarksList obj4){
		obj4.num +=10;
		System.out.println(obj4.num);  // 70
	}
	
	String myStr = "7007";
	
	public void doStuff(String str){
		int myNum = 0;
		try{
			String myStr = str;
			myNum = Integer.parseInt(myStr);
		} catch(Exception e){
			System.out.println(e.toString());
		}
		System.out.println("myStr: " + myStr + " myNum: " + myNum); // myStr: 7007 myNum: 9009
	}
	
	public static void main(String[] args) {
		MarksList obj1 = new MarksList();
		MarksList obj2 = obj1; 
		MarksList obj3 = null;
		
		obj2.num = 60;
		graceMarks(obj2);
		
		obj1.doStuff("9009");
	}

}
