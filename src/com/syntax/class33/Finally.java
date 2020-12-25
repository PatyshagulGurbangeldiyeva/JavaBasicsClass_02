package com.syntax.class33;

import java.io.FileInputStream;

public class Finally {

	public static void main(String[] args) {
		
	

		
		String file=System.getProperty("user.dir")+"/configs/Examples.properties";
		
		try {
			FileInputStream fis=new FileInputStream(file);

	}catch (Exception e) {
		System.out.println("I am a catch block");
	}finally {
		System.out.println("I am a finally block"); //---> it will execute where's there is exception or not
	}

}
}