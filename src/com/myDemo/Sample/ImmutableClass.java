package com.myDemo.Sample;

// Add keyword "final" to make any class as immutable - > Means it will not change
public final class ImmutableClass {
	private String firstname;
	private String lastname;
	
	public void FullName(String fname, String lname){
		this.firstname = fname;
		this.lastname = lname;
	}
	
	public String getFirstName(){
		return firstname;
	}
	
	public String getLastName(){
		return lastname;
	}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stubs
			// System.out.println(firstname + lastname);
		}
}
