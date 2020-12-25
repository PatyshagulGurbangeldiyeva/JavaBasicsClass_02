package com.syntax.class33;

public class InfoAboutException {

	public static void main(String[] args) {
		
		String str="Hello";
		
		try {
			char character=str.charAt(10);
			
			System.out.println(character);
			
		}catch (StringIndexOutOfBoundsException se) {
	//		to get info about the exception we can use three different ways:
	//		se.printStackTrace();//--->  we will get name of the exception, message about exception and where it is occurs
	//		System.out.println(se);// ----> we will get the name and message if Exception
			System.out.println(se.getMessage()); //--> we will get just the message of exceptation
		}
		
System.out.println("******** end of the code ***********");
	}

}
