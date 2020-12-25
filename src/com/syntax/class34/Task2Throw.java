package com.syntax.class34;

public class Task2Throw {
	
	public static void checkUserName(String name) {
		if (name.length()<6) {
			throw new RuntimeException("user name must be more than 5 charecters");
		}else {
			System.out.println("user name is more than 5 charecters");
		}
	}

	public static void main(String[] args) {
		
		/*Create a method checkUserName that will throw a runtime exception. 
		 * Method should throw an exception when entered username is less than 5 characters.
		 */
		
		checkUserName("Alparslan");
		
		checkUserName("Paty");

	}

}
