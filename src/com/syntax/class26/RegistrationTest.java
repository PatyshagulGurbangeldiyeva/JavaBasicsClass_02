package com.syntax.class26;

public class RegistrationTest {

	public static void main(String[] args) {
		
		Registration register=new Registration();
		register.setEmail("register@gmail.com");
		System.out.println(register.getEmail());
		System.out.println();
		
		register.setEmail("register@yahoo.com");
		System.out.println(register.getEmail());

		System.out.println();
		
		register.setUserName("Alp");
		System.out.println(register.getUserName());
		System.out.println();
		
		register.setUserName("Alparslan");
		System.out.println(register.getUserName());
		
		System.out.println();
		
		register.setPassword("12334de");
		System.out.println(register.getPassword());
	}

}
