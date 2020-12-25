package com.syntax.class34;

public class Task1Throw {
	
	public static void age( int age) {
		
		if (age<16) {
			throw new RuntimeException("you are too young");
			
		}else {
			System.out.println("you are eligible");
		}
		
	}

	public static void main(String[] args) {
		

		// create a method where you will use throw or throws
		// if the age of the person is smaller 
		
		age(17);
		
		age(3);

	}

}
