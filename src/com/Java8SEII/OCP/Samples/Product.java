package com.Java8SEII.OCP.Samples;

public class Product {
	
	String name;
	Integer price;
	
	Product(String name, Integer price){
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public void printVal(){
		System.out.println(name + " Price : " + price + " ");
	}

}
