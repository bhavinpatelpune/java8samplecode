package com.san;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MergeOject {
public static class MergeOjectAddress {
    private String contentId;
    private String address;

    MergeOjectAddress(String id, String address) {
        this.contentId = id;
        this.address = address;
    }

    public String getContentId() {
        return contentId;
    }

    public String getAddress() {
        return address;
    }

	@Override
	public String toString() {
		return "MergeOjectAddress [contentId=" + contentId + ", address=" + address + "]";
	}
    
    
}

public static void main(String[] args) {
    List<MergeOjectAddress> myList = new ArrayList<MergeOjectAddress>();
    MergeOjectAddress o1 = new MergeOjectAddress("1", "Pune");
    myList.add(o1);
    MergeOjectAddress o2 = new MergeOjectAddress("1", "Pimple");
    myList.add(o2);
    MergeOjectAddress o3 = new MergeOjectAddress("2", "Mumbai");
    myList.add(o3);
    MergeOjectAddress o4 = new MergeOjectAddress("2", "Goregaon");
    myList.add(o4);
    MergeOjectAddress o5 = new MergeOjectAddress("3", "Delhi");
    myList.add(o5);

    myList.forEach(System.out::println);

    myList.stream()
    	  .collect(Collectors.groupingBy(MergeOjectAddress::getContentId,Collectors.mapping(MergeOjectAddress::getAddress,Collectors.toList())))
    	  .forEach((id, addresses) -> System.out.printf("ID: %s Address: %s \n", id, addresses.stream().collect(Collectors.joining(" "))));

    
    Optional<MergeOjectAddress> matchingObject = myList
    		.stream()
    		.filter(p -> p.getContentId().equals("2"))
    		.findAny();
     	
    System.out.println(matchingObject);
}

}