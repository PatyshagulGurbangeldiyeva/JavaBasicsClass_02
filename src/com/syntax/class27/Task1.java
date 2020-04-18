package com.syntax.class27;

import java.util.ArrayList;

public class Task1 {

	// Create an arraylist of cars and retrieve all the values using 3 different ways.
	public static void main (String [] args) {
		ArrayList <String> car= new ArrayList <>();
		
		car.add("WV");
		car.add("Toyota" );
		car.add("BMW");
		
		System.out.println("FIRST WAY");
		
		System.out.print(car+" ");
		System.out.println();
		
		
		
		System.out.println("second way");
		
		for (String cars:car) {
			System.out.print(cars+" ");
			
		}
		System.out.println();
		
		
		System.out.println("third way");
		
		for (int i=0; i<car.size(); i++) {
			String element=car.get(i);
			System.out.print(element+" ");
		}
		
	}

	
}