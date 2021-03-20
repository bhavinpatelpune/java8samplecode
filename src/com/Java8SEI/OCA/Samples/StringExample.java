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
		ta.replace('C', 'D');
		ta = ta.concat(tb);
		System.out.println(ta); // A B C C 
		
		System.out.println("-----------------");
		
		String strr = "Hello World ";
		strr.trim();
		int ii1 = strr.indexOf(" ");
		System.out.println(ii1);  // OP: 5
		
		System.out.println("-----------------");
		
		String st11= "JAVA";
		String[] st22 = {"J","A","V","A"};
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
		
		
	}

}
