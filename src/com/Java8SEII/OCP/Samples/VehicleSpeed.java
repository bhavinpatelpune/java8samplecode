package com.Java8SEII.OCP.Samples;

public class VehicleSpeed {
	
	int distance;//line n1
	
	VehicleSpeed (int x) {
		this.distance = x;
		}
	
	public void increSpeed(int time) {//line n2
		int timeTravel = time;//line n3
				class Car {
					int value = 0;
					public void speed () {
						value = distance /timeTravel;
						System.out.println("Velocity with new speed - "+value+" kmph");
					}
				}
		new Car().speed();
		}

	public static void main(String[] args) {
		VehicleSpeed v = new VehicleSpeed(100);
		v.increSpeed(60); // Velocity with new speed - 1 kmph
	}
}