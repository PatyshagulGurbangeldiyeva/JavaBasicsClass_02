package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReading {

	public static void main(String[] args) throws IOException {
	
		String filePath="/Users/vepagurbangeldiyev/eclipse-workspace/JavaClass/configs/Filereading.properties";
		System.out.println(filePath);
		
		System.out.println();
		
		String userDirectory=System.getProperty("user.dir");
		System.out.println(userDirectory);
		
		System.out.println();
		
		String userName=System.getProperty("user.name");
		System.out.println(userName);
		
		System.out.println();
		
		String osName=System.getProperty("os.name");//---> operating system
		System.out.println(osName);
		
		
		// lets bring file 
		
		String filePath1=System.getProperty("user.dir")+"/configs/Filereading.properties";
		System.out.println(filePath1);
		
		System.out.println();
		
		FileInputStream fis=new FileInputStream(filePath1);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String browser=prop.getProperty("browser");
		String url=prop.getProperty("url");
		
		System.out.println("browser is: "+browser+" and the url is: "+url);
		
		// here we read the files from java
		
		// and right now we want to add new information
		
		// if you want to add you need to use FileOutputStream
		
		prop.getProperty("phone number", "1234556");
		
		FileOutputStream fos=new FileOutputStream(filePath1);
		
		prop.store(fos, "Added additional key");
		
		
		
		

	}

}
