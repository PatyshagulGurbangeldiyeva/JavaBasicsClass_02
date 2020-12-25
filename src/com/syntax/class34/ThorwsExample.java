package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThorwsExample {

	public static void main(String[] args) throws FileNotFoundException     {

		ThorwsExample.multipleSleep(); // in a method  we handled it (using try and catch) then when we called the method it did not give exception
										
		
		read("");	// as this method doesn't handled responsibility of handling we are throwing it again(if we don't want to handle it)
					// throws FileNotFoundException
		
					// if we will handle this read()exception then the rest of the code will be seen
		
//		System.out.println("end of the code");  //---> handle read(""); then this block will be executed
		
		
	
	}									
	
	
	
	
	//method3
	public static void read(String filePath) throws FileNotFoundException {
		
		FileInputStream fis=new FileInputStream(filePath);
		
		
	}
	
	
	//method2
	public static void multipleSleep()  {
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	// method1
	public static void sleep() throws InterruptedException {
		Thread.sleep(2000); // we do not want do handle Thread.sleep so we use throws keyword, I am giving information that this method will give exception
	}
	
	
	
}
