package com.syntax.class26;

import java.util.ArrayList; // if you want to add collection we need to import this util!!!

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// create an arraylist with names
		
		ArrayList<String>arrayList=new ArrayList<>();
		
		// adding String object into arrayList
		arrayList.add("John");
		arrayList.add("Bella");
		
		// access element from arrayList
		String secondElement=arrayList.get(1);
		System.out.println(secondElement);
		
		// arrayList is dynamic it means we can add more names(elements)
		
		arrayList.add("Judy");
		arrayList.add("Jaxon");
		System.out.println();
		
		// how to get number of elements inside the arrayList
		int size=arrayList.size();// as size returns int we declarde size as int!!
		System.out.println(size);
		
		System.out.println();
		
		arrayList.add("Mary"); // here we add Mary so in the array we have 5 people=5 elements
		System.out.println(arrayList.size());
		
		System.out.println(arrayList);
		
		// lets remove one element
		arrayList.remove("John");// we removed john and in the array we have 4 people= 4 elements
		System.out.println(arrayList.size()); 
		
		System.out.println();
		
		// replacing elements
		arrayList.set(1, "Bob");
		
		System.out.println(arrayList);
		System.out.println();
		
		// how to retrieve values from arrayList 1 by 1
		for (int i=0; i<arrayList.size();i++) {
			String element=arrayList.get(i);
			System.out.println(element);
		}
		
		System.out.println();
		// for enhenced loop
		
		for (String element:arrayList) {
			System.out.println(element);
		}
		
	}
}
