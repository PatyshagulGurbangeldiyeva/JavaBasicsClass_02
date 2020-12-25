package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TaskMap {

	public static void main(String[] args) {
		/* Create a map of countries with its capital that will store countries in alphabetical order.
		 * Print all keys and values from a country map using for each loop and iterator.
		 * Print all values from a country map using for each loop and iterator.
		 */


		Map <String, String> countries=new TreeMap<>();
		countries.put("USA", "Washington DC");
		countries.put("Turkmenistan", "Ashgabat");
		countries.put("Turkey", "Ankara");
		countries.put("Russia", "Moscow");
		countries.put("Azerbayjan", "Baku");
		
		System.out.println(countries);// just to check did I use the right map type
		
		System.out.println();
		
		System.out.println("Printing all keys by using for each loop");
		
		for (String c:countries.keySet()) {
			System.out.println(c);
		}
		System.out.println();
		
		System.out.println("printing all keys by using ITERATOR");
		Iterator <String> keyIt=countries.keySet().iterator();
		
		while (keyIt.hasNext()) {
			System.out.println("key values: "+keyIt.next());
		}
		
		System.out.println();
		
		System.out.println("Printing all values from map by using for each loop");
		
		for (String val:countries.values()) {
			System.out.println("value: "+val);
		}
		
		System.out.println();
		System.out.println("getting values from map by using ITEARATOR");
		
		Iterator <String> valIt=countries.values().iterator();
		while (valIt.hasNext()) {
			System.out.println("values: "+valIt.next());
		}
	}

}
