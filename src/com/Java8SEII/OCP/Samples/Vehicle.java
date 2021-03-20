package com.Java8SEII.OCP.Samples;

public class Vehicle {
	
	int vId;
	String vName;
	
	public Vehicle(int vIdArg, String vNameArg){
		this.vId = vIdArg;
		this.vName = vNameArg;
	}
	
	public int getVid() {
		return vId;
	}
	
	public String getVName() {
		return vName;
	}
	
	public String toString() {
		return vName;
	}

}
