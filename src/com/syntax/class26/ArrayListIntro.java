package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListIntro {
	
	public static void main(String[] args) {
		

	
	// create an arraylist to store numbers
	
	ArrayList<Integer> numbers=new ArrayList<>();
	
	numbers.add(10); // aouto boxing happened (converting to String)
	numbers.add(12);
	numbers.add(2);
	numbers.add(30);
	

	
	System.out.println(numbers.get(1));
	
	System.out.println("----------");
	
	// let's print all the elements
	
	for (int i=0; i<numbers.size();i++) {
		int num=numbers.get(i); // aoutounboxing
		System.out.println(num);
	}
	
	System.out.println();
	
	for (Integer num:numbers) {
		System.out.println(num);
	}

	}
}
