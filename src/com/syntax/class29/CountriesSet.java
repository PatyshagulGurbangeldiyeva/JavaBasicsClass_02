package com.syntax.class29;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CountriesSet {

	public static void main(String[] args) {
		
		/*Create a Set collection in which you need to add names of the countries.
		 *In this set we want all objects to be sorted in alphabetical order. 
		 *Using 2 different ways retrieve all elements from set.
		 */

	Set <String>countries=new TreeSet<>();
	countries.add("USA");
	countries.add("Russia");
	countries.add("Turkey");
	countries.add("Turkmenistan");
	countries.add("Alnbania");
	countries.add("Mexico");
	
	System.out.println("******* USING ENHANCED FOR LOOP FOR PRINTING EACH ELEMENT ***************");
	
	for (String c:countries) {
		System.out.print(c+" ");
	}
	System.out.println();
	System.out.println("******** USING PRINT FOR PRINTING IN ARRAY ************");
	 System.out.println(countries);
	
	 System.out.println();
	 System.out.println("******** USING ITTERATOR ************");
	 
	 Iterator <String> it=countries.iterator();
	 
	 while (it.hasNext()) {
		 System.out.print(it.next()+" ");
	 }
	}

}
