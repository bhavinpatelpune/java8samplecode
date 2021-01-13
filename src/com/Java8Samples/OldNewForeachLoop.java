package com.Java8Samples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class OldNewForeachLoop {
	
	//1] Old classical foreach loop before Java-8
	public static void OldClassicLoop() {
	    Map<String, Integer> objmap = new HashMap<>();
	    objmap.put("A", 1);
	    objmap.put("B", 2);
	    objmap.put("C", 3);
	    objmap.put("C", 4);
	    objmap.put("C", 5);
	    objmap.put(null, 4);

	    System.out.println("Old classical foreach loop before Java-8");
	    for (Map.Entry<String, Integer> entry : objmap.entrySet()) {
	        System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
	    }
	}
	
	//2] New foreach loop in Java-8 onward (Using Lambda function)
	public static void NewloopMapInJava8() {
	      Map<String, Integer> objmap = new HashMap<>();
	      objmap.put("D", 1);
	      objmap.put("E", 2);
	      objmap.put("F", 3);
	      objmap.put("F", 3);
	      objmap.put(null, 3);
	      objmap.put("F", null);

	      System.out.println("New foreach loop in Java-8 onward (Using Lambda function)");
	      // Lambda
	      if(objmap!=null){
	    	  objmap.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
	      }
	      
	      // Check map null key to remove in print
	      objmap.forEach(
	              (k, v) -> {
	                  // Not null - Yes logic 
	                  if (k != null){
	                      System.out.println("Key : " + k + ", Value : " + v);
	                  }
	              }
	          );
	  }
	
	//3] Old classical foreach loop using Array List before Java-8	
	  public static void OldClassicListLoop() {
	      List<String> objlist = new ArrayList<>();
	      objlist.add("AA");
	      objlist.add("BB");
	      objlist.add("CC");
	      objlist.add("CC");

	      System.out.println("Old classical foreach loop using Array List before Java-8	");
	      // normal loop
	      for (String str : objlist) {
	          System.out.println(str);
	      }
	  }
	  
	//4] New foreach loop in ArrayList Java-8 onward (Using Lambda function)
	  public static void NewloopListInJava8() {
	      List<String> objlist = new ArrayList<>();
	      objlist.add("AA");
	      objlist.add("BB");
	      objlist.add("CC");
	      objlist.add("CC");
	      objlist.add(null);
	      objlist.add(null);

	      System.out.println("New foreach loop in ArrayList Java-8 onward (Using Lambda function)");
	      // Using Lambda
	      objlist.forEach(x -> System.out.println(x));

	      // Using Method Reference to element value
	      objlist.forEach(System.out::println);
	      
	      System.out.println("Filtering Null Value using Stream API");
	      objlist.stream().filter(Objects::nonNull)
	      				  .forEach(System.out::println);
	  }
	  
	  
	
	public static void main(String[] args) {
		OldClassicLoop();
//		NewloopMapInJava8();
//		
//		OldClassicListLoop();
//		NewloopListInJava8();
	}
}

