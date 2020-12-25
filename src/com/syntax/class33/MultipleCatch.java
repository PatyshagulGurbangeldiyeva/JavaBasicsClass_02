package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MultipleCatch {

	public static void main(String[] args) {
		
		String file=System.getProperty("user.dir")+"/configs/Examples.properties";
		
		try {
			FileInputStream fis=new FileInputStream(file);
			fis.close();// as we closed fis the problem will be in line 18
			Properties prop=new Properties();
			prop.load(fis);// new IOException
		
			
		} catch (FileNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
System.out.println("end of the program"); 
	}

}
