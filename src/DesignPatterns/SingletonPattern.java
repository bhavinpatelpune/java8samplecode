package DesignPatterns;

public class SingletonPattern {
	
	private static final SingletonPattern instance = new SingletonPattern();
	
	//Constructor of Singleton Class will always be private - > because it cannot be access outside the class
	private SingletonPattern(){	}

	public static SingletonPattern getInstance() {
		return instance;
	}
	
	public static void main(String args[]){
		SingletonPattern.getInstance();
	}
}
