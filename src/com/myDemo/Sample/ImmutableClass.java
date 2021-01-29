package com.myDemo.Sample;

import java.util.HashMap;
import java.util.Map;

/*
The class must be declared as final (So that child classes can’t be created)
Data members in the class must be declared as private (So that direct access is not allowed)
Data members in the class must be declared as final (So that we can’t change the value of it after object creation)
A parametrized constructor should initialize all the fields performing a deep copy (So that data members can’t be modified with object reference)
Deep Copy of objects should be performed in the getter methods (To return a copy rather than returning the actual object reference)
No setters (To not have the option to change the value of the instance variable)


How to Create an immutable class in Java?
To create an immutable class in Java, you have to do the following steps.

Declare the class as final so it can’t be extended.
Make all fields private so that direct access is not allowed.
Don’t provide setter methods for variables.
Make all mutable fields final so that its value can be assigned only once.
Initialize all the fields via a constructor performing deep copy.
Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
To understand points 4 and 5, let’s run the sample Final class that works well and values don’t get altered after instantiation.

*/

// Add keyword "final" to make any class as immutable - > Means it will not change
//public final class ImmutableClass {
//	private String firstname;
//	private String lastname;
//	
//	public void FullName(String fname, String lname){
//		this.firstname = fname;
//		this.lastname = lname;
//	}
//	
//	public String getFirstName(){
//		return firstname;
//	}
//	
//	public String getLastName(){
//		return lastname;
//	}
//	
//		public static void main(String[] args) {
//			// TODO Auto-generated method stubs
//			// System.out.println(firstname + lastname);
//		}
//}

public final class ImmutableClass {
    private final String name;
    private final int regNo;
    private final Map<String, String> metadata;
 
    public ImmutableClass(String name, int regNo, Map<String, String> metadata)
    {
        this.name = name;
        this.regNo = regNo;
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry : metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        this.metadata = tempMap;
    }
 
    public String getName() { return name; }
 
    public int getRegNo() { return regNo; }
 
    public Map<String, String> getMetadata() {
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry :
             this.metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }
}
 
// Driver class
class Test {
    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<>();
        map.put("1", "first");
        map.put("2", "second");
        ImmutableClass s = new ImmutableClass("ABC", 101, map);
        System.out.println(s.getName());
        System.out.println(s.getRegNo());
        System.out.println(s.getMetadata());
 
        // Uncommenting below line causes error
        // s.regNo = 102;
 
        map.put("3", "third");
        System.out.println(s.getMetadata()); // Remains unchanged due to deep copy in constructor
 
        s.getMetadata().put("4", "fourth");
        System.out.println(s.getMetadata()); // Remains unchanged due to deep copy in getter
    }
}