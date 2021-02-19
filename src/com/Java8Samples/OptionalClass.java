package com.Java8Samples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

//Java 8 has introduced new class Called Optional. This class is basically introduced to avoid NullPointerException in java.
//Optional class encapsulates optional value which is either present or not.
//It is a wrapper around object and can be use to avoid NullPointerExceptions.

public class OptionalClass {
	// Older Approach	
//	public String getCityForEvent(int id) {
//	    Event event = getEventWithId(id);
//	    if(event != null) {
//	        Location location = event.getLocation();
//	        if(location != null) {
//	            return location.getCity();
//	        }
//	    }
//	    return "TBC";
//	}
	
	// Newer Approach
//	public String getCityForEvent(int id) {
//	    Optional.ofNullable(getEventWithId(id))
//	            .flatMap(this::getLocation)
//	            .map(this::getCity)
//	            .orElse("TBC");
//	}
	
	/// get NonRepeated character without using Optional
	public static Character getNonRepeatedCharacterWithoutOptional(String str) {
	    Map<Character, Integer> countCharacters = new LinkedHashMap<Character, Integer>();
          for (int i = 0; i < str.length() - 1; i++) {
           Character c = str.charAt(i);
           if (!countCharacters.containsKey(c)) {
            countCharacters.put(c, 1);
           } else {
            countCharacters.put(c, countCharacters.get(c) + 1);
           }
          }
          // As LinkedHashMap maintains insertion order, first character with
          // count 1 should return first non repeated character
          for (Entry<Character, Integer> e : countCharacters.entrySet()) {
           if (e.getValue() == 1)
            return e.getKey();
 
          }
          return null;
 
        }
	
	/// get NonRepeated character with using Optional (Java-8 class)
	public static Optional<Character> getNonRepeatedCharacterWithOptional(String str) {
        Map<Character, Integer> countCharacters = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < str.length() - 1; i++) {
         Character c = str.charAt(i);
         if (!countCharacters.containsKey(c)) {
          countCharacters.put(c, 1);
         } else {
          countCharacters.put(c, countCharacters.get(c) + 1);
         }
        }
        // As LinkedHashMap maintains insertion order, first character with
        // count 1 should return first non repeated character
        for (Entry<Character, Integer> e : countCharacters.entrySet()) {
         if (e.getValue() == 1)
          return Optional.of(e.getKey());

        }
        return Optional.ofNullable(null);

       }

	public static void main(String[] args) {
		
//		METHOD - 1
//		OUTPUT - Exception in thread "main" java.lang.NullPointerException
//		There is no non repeating character for getNonRepeatedCharacter("SASAS") hence it will return null and we are calling c.toString, 
//		so it will obviously throw NullPointerException.
//		You can use Optional to avoid this NullPointerException.
//		Let’s change the method to return Optional object rather than String.
		
		Character c = getNonRepeatedCharacterWithoutOptional("SASAS");
	    System.out.println("Non repeated character is :" + c.toString());
	    
	    
//		METHOD - 2
//	    When above method returned Optional, you are already aware that it can return null value too.
//	    You can call Optional’s isPresent method to check if there is any value wrapped in Optional.	    
	    Optional<Character> opCh = getNonRepeatedCharacterWithOptional("SASAS");
        if(opCh.isPresent()) {
            System.out.println("Non repeated character is :" + opCh.toString());
        } else {
            System.out.println("No non repeated character found in String");
        }
	}

}
