

package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionIntro {

	static String str;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		int a=10;
		int b=0;
		
//		System.out.println(a/b); -----> ArithmeticException
		
		System.out.println("end of the program");

		int [] array= {12,3,5};
//		System.out.println(array[3]);------->ArrayIndexOutOfBoundsException
		
//		System.out.println(str.length()); ------->.NullPointerException
		
		
		// SO WE CAN HANDLE THE EXCEPTION BUT WE ARE NOT FIXING THE EXCEPTION. EXCEPTION WILL STILL OCCUR
		
		// errors and exceptions are throwable , but errors cannot be handled as exceptions can
		
		NullPointerException npe=new NullPointerException();
		throw (npe);
		
//		Thread.sleep(2000);
		
//		String filePath="";
//		FileInputStream fis=new FileInputStream(filePath);
//		
		
	}

}
