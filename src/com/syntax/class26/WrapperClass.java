package com.syntax.class26;

public class WrapperClass {
	public static void main(String[] args) {
		
		
		int i=10; // here is int is primitive type
		
		Integer num=10;// here we are wrapping int to the obj. Integer is a class type
		String s=num.toString(); // will conver the variable 10 to the string
		System.out.println(s);
		System.out.println(num.MIN_VALUE);
		
		System.out.println();
		Byte b=90;
		System.out.println(b.MIN_VALUE);// here we are finding min value of the byte
		System.out.println(b.MAX_VALUE);// finding maximum value of the byte
		
		String s1=b.toString();// converting the numerical to the string same value will be
		System.out.println(s1); 
		
		Boolean bool=false;
		System.out.println(bool.booleanValue());
		
		
	}

}
