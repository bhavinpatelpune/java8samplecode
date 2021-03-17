package com.Java8SEII.OCA.OCP.Samples;

public class Planet {
	public String name;
	public int moons;
	
	public Planet(String name, int moons){
		this.name = name;
		this.moons = moons;
	}
	
	public static void main(String[] args) {
		Planet[] myplanets = {
				new Planet("Mercury",0),
				new Planet("Venus",0),
				new Planet("Earth",1),
				new Planet("Mars",2)
		};
		
		System.out.println(myplanets);
		System.out.println(myplanets[2].name);
		System.out.println(myplanets[2].moons);
		
		//OP: [Lcom.Java8SEII.OCA.OCP.Samples.Planet;@15db9742
		//	Earth
		//	1
	}

}
