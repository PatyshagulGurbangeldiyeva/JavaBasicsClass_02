package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2Myself {
	
	static List <Exception> call(){
		
		List <Exception> exList=new ArrayList<>();
		
		int a=60;
		int b=0;
		
		try {
			System.out.println(a/b);
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}	
		
		String filePath="";
		try {
			FileInputStream fis=new FileInputStream(filePath);
			System.out.println(fis);
		}catch(FileNotFoundException fnf) {
			fnf.printStackTrace();
		}
		
		int [] arr= {1,2,3};
		try {
			System.out.println(arr[5]);
		}catch (ArrayIndexOutOfBoundsException aoi) {
			System.out.println(aoi);
		}
		
		String z="Hello";
		try {
			char charecter=z.charAt(8);
			System.out.println(charecter);
		}catch (StringIndexOutOfBoundsException so) {
			System.out.println(so.getMessage());
		}
		return exList;
	}

	public static void main(String[] args) {
		
//		Create a static method that will return a List of Exceptions.
//		Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
//		Call your method inside main and print name and details of all Exception objects.
		
		List <Exception> t=call();
		
//		for (Exception g:t) {
//			System.out.println(g);
//		}

		Iterator <Exception>it=t.iterator();
		
		while (it.hasNext()) {
			String mes=it.next().getMessage();
			System.out.println(mes);
		}
	}

}
