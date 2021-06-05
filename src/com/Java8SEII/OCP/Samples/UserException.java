package com.Java8SEII.OCP.Samples;

class MyUserException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

class AgeOutOfLimitException extends MyUserException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

class UserException {

	public void doRegister(String name, int age) throws MyUserException,
			AgeOutOfLimitException {
		if (name.length() < 6) {
			throw new MyUserException();
		} else if (age > 60) {
			throw new AgeOutOfLimitException();
		} else {
			System.out.println("User is registered.");
		}
	}

	public static void main(String[] args) throws MyUserException {
		UserException t = new UserException();
		t.doRegister("Bhavin", 60);  /// User is registered.
	}
}