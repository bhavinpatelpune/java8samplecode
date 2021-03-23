package com.Java8SEI.OCA.Samples;

public class StringExample {
	
	private static int $;

	public static void main(String[] args) {

		String str = "JavaSE";
		int strLoc = str.indexOf("S");
		char cTxt = str.charAt(strLoc);
		System.out.println(cTxt); // OP: S
		
		System.out.println("-----------------");
		
		String name = "";
		name.concat("Bhavin");
		name.concat("Patel");
		System.out.println("My Name is : " + name); // OP: My Name is : 
		
		String txt = "Bhavin Patel";
		System.out.println(txt.length());  // OP: 12
		
		float price = 120;
		System.out.println(price + " INR");
		
		System.out.println("-----------------");

		String ta = "A ";
		ta = ta.concat("B ");
		String tb = "C ";
		ta = ta.concat(tb);
		ta.replace("C", "D");
		ta = ta.concat(tb);
		System.out.println(ta); // A B C C 
		
		System.out.println("-----------------");
		
		String strr = "Hello World ";
		strr.trim();
		System.out.println(strr);
		int ii1 = strr.indexOf(" ");
		System.out.println(ii1);  // OP: 5
		
		System.out.println("-----------------");
		
		String st11= "Java";
		String[] st22 = {"J","a","v","a"};
		String st33 = "";
		for(String ss: st22){
			st33 = st33 + ss;
		}
		boolean b1 = (st11.equals(st33));
		boolean b2 = (st11 == st33);
		System.out.println(b1 + " " + b2); // OP: true false
		
		System.out.println("-----------------");

		String a_b;			
		System.out.println($);
		//System.out.print(a_b); //The local variable a_b may not have been initialized
		System.out.println("-----------------");
		
		String s1 = "Java";
		String s2 = "Java";
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Ja").append("va");
		System.out.println(s1 == s2); // true
		System.out.println(s1.equals(s2)); // true
		System.out.println(sb1.toString() == s1);  // false
		System.out.println(sb1.toString().equals(s1)); // true
		/*String literals are used from the string pool. 
		This means that s1 and s2 refer to the same object and are equal. 
		Therefore, the first two print statements print true. 
		The third print statement prints false because toString() uses a method to compute the value and 
		it is not from the string pool. The final print statement again prints true because equals() looks 
		at the values of String objects. */	
		
		System.out.println("-----------------");
		
		StringBuilder sbb = new StringBuilder("Java");
		String str1 = "Java";
		if(sbb.toString().equals(str1.toString()))
			System.out.println("Match 1");  // Match 1
		else if (sbb.equals(str1))
			System.out.println("Match 2");
		else
			System.out.println("No Match");
		
		System.out.println("-----------------");
		
		String str11=" ";
		str11.trim();
		System.out.println(str11.equals("") + " " + str11.isEmpty());  // false false
		
		System.out.println("-----------------");
		
		System.out.println("Hello " + new StringBuilder("Java SE 8")); // Hello Java SE 8
		System.out.println("Hello " + new MyString("Java SE 8"));  // Hello com.Java8SEI.OCA.Samples.MyString@15db9742
		
	}

}
