package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToProperty {

	public static void main(String[] args) throws IOException {
		// write to existing file and add values
		
		String filePath="/Users/vepagurbangeldiyev/eclipse-workspace/JavaClass/configs/Examples.properties";
		// we must write the location of our file

		FileInputStream fis=new FileInputStream(filePath); // here in constructor we need to specify our path!!!
		
		Properties prop=new Properties();// we need to create an obj of properties file
		
		prop.load(fis);// we need to load to existing data
		
		prop.getProperty("phone number", "12345666"); // here we are adding to the note
		
		FileOutputStream fos=new FileOutputStream(filePath);
		
		prop.store(fos, "Added additional key");
		
		// if you will not upload the previous data that were in file and just add new key, 
		// then all the previous data will deleted. so make sure that you UPLOADED
		
		
	}

}
