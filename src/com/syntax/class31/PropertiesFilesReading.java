package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFilesReading {

	public static void main(String[] args) throws IOException {
		
		//  to read a file we need:
		// 1. have a file
		
		String filePath="/Users/vepagurbangeldiyev/eclipse-workspace/JavaClass/configs/Examples.properties";// we must write the location of our file

		// 2. bring obj of FileInputStream
		
		FileInputStream fileInput=new FileInputStream(filePath);// here in constructor we need to specify our path!!!
		
		// (command shif O)---> short cut for importing
		
		
		
		//3. to handle data from .properties file we need Properties Class
		
		Properties prop=new Properties();
		
		prop.load(fileInput);
		
		String name=prop.getProperty("name");
		String lastName=prop.getProperty("lastName");
		String city=prop.getProperty("city");
		String country=prop.getProperty("country");
		
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(city);
		System.out.println(country);
		
		System.out.println();
		
		System.out.println("********** in order to get map from the note (using keySet()) ***********  ");
		
		Set <Object> keys=prop.keySet();
		for (Object key:keys) {
			System.out.println(key);
			
		}
		System.out.println();
	}

}
