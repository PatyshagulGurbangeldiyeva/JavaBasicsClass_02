package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingException {

	public static void main(String[] args) {
		
		try {
			Thread.sleep(2000); // inside the try we are writing that might be an exception
		}catch (InterruptedException e) { 
			System.out.println("Catched InterrupdetException Exception");// inside the catch we write what kind if exception it is
		}

		String fPath="";
		try {
			FileInputStream fis=new FileInputStream(fPath);
		}catch (FileNotFoundException fne) {
			System.out.println("Catched FileNotFoundException Exception");
		}
		System.out.println("End of program");
		System.out.println();
		System.out.println("Continue to next try block");
		System.out.println();
		// lets to catch Arithmetic exception: it happens when we tried to divide the number by zero
		int a=10;
		int b=0;
		
		try {			//  referance can be parents(upcasting        creating class of exception 
			System.out.println(a/b); //--->   Throwble ae      =    new AritchmeticException();
			System.out.println("d"); // --> it won't be printed as we are using in main method top to down. 
									//-----> if the first code accepted then the next won't be solved, will be just ignored
			
		}catch (ArithmeticException ae) { // or here you can write (Throwable ae) upcasting!!!!
			System.out.println("Catched ArithmeticException Exception");
		}
		System.out.println("End of the program");
		
		System.out.println("Continue to next try block");
		System.out.println();
		
		
	}

}
