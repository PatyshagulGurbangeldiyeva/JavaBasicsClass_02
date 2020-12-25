package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Task1 {

	public static void main(String[] args) throws IOException {
		
		// create a file to store following congigurations
		// browser, url, userName, password
		// read the file and extract values of browser and url
	
		// create a path: --> we need it to finde the file that we want
		String filePath="/Users/vepagurbangeldiyev/eclipse-workspace/JavaClass/configs/task1.properties";
		
		// specify the path
		FileInputStream fis=new FileInputStream(filePath);
		
		// create an obj of Properties
	    Properties prop=new Properties();
		 
	    // loading the path
	    prop.load(fis);
		 
		System.out.println("browser");
		System.out.println("url");
}
}
