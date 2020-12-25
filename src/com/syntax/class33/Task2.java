package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2 {
	
	public static List<Exception> getAllExceptions() {
		
//		Create a static method that will return a List of Exceptions.
//				Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
//				Call your method inside main and print name and details of all Exception objects.
		
		
		List <Exception> exceptionList=new ArrayList<>();
		
		// adding 1 obj of exception type
		int []array= {1,2,3};
		try {
			System.out.println(array[4]);// trying to access illegal index
			
		}catch (ArrayIndexOutOfBoundsException aob) {
			exceptionList.add(aob);
		}
		
		
		// adding 2 obj of exception type
		int a=10;
		
		int b=0;
		try {
			System.out.println(a/b);
		}catch (ArithmeticException ae) {
			exceptionList.add(ae);
		}
		
		
		// adding 3 obj of exception type
		String filePath="";
		
		try {
			FileInputStream fis=new FileInputStream(filePath);
		}catch(FileNotFoundException fnf) {
			exceptionList.add(fnf);
		}
		
		// adding 4 obj of exception type
		
		String str="hi";
		try {
			char charecter=str.charAt(7);
			System.out.println(charecter);
		}catch(StringIndexOutOfBoundsException siobe) {
			exceptionList.add(siobe);
		}
		
		return exceptionList;
	}

	public static void main(String[] args) {
		
//		Create a static method that will return a List of Exceptions.
//				Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
//				Call your method inside main and print name and details of all Exception objects.

		
		List <Exception> list=getAllExceptions();// --> as this method return List<exception>
		
//		System.out.println(list.size());
		
		Iterator <Exception> it=list.iterator();
		
		while(it.hasNext()) {
//		String msg=	it.next().getMessage();
//		System.out.println(msg);
			
//		it.next().printStackTrace();
		
		System.out.println(it.next());
			
		}
	}

}
