package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		

	}
	
	public static void division(int a, int b) {
		try {
			System.out.println(a/b);
		}catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
			System.out.println();
			System.out.println(ae);
			System.out.println();
			ae.printStackTrace();
		}
		
	}
	
	public static int division1(int a, int b) {
		int result=0;
		
		try {//--> try must have its pair. catch or finally must be
			result=(a/b);
			System.out.println(result);
		}
			
//		catch (ArithmeticException ae) {
//			
//			System.out.println(ae.getMessage());
//			System.out.println();
//			System.out.println(ae);
//			System.out.println();
//			ae.printStackTrace();	
//		}
		finally { //---> even there is no catch the finally will be executed and the exceptions too
			System.out.println("I am finally block");
		}
		return result;
	}
	
	public static void read(String filePath) {
		FileInputStream fis=null;// as it local variable in method we need to initialize it
		
		try{
			// every code in in it block will be local and no one block can reach it. 
			// we cannot call the variable of this block from another block
			
			fis=new FileInputStream(filePath);
			
			Properties prop=new Properties();
			prop.load(fis);//--> we are loading data from the file
			
		}catch(FileNotFoundException e){
			
			e.printStackTrace();
			
		}catch (IOException e) {
			
			e.printStackTrace();
			
		}finally {
			try {
				if (fis!=null) {
					fis.close();
				}
				
			}catch(IOException e) {
				
				e.printStackTrace();
			}
			
		}
	}
}


