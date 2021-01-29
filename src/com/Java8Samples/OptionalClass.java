package com.Java8Samples;

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
