package com.syntax.class29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OtherMaps {

	public static void main(String[] args) {
		// let's store student id and student name----> Student id is int and name is String
		// LinkedHashMap gives the order of the obj
		
		
		Map<Integer, String> lmap=new LinkedHashMap<>(); // we are using wrapped obj Integer!!!
		
		lmap.put(1234, "Bob");
		lmap.put(456, "Jane");
		lmap.put(980, "Chloe");
		lmap.put(3452, "Lila");
		
		System.out.println(lmap);// sortng as we declared it
		
		System.out.println("******************");
		
		// store objects in a form of K and V and you want to sort your keys as Ascending order
		
		Map <Integer, String> tmap=new TreeMap();
		
		tmap.put(1000,"a");
		tmap.put( 3000, "b");
		tmap.put(1001, "c");
		
		System.out.println(tmap); // will print according to the key
		
		System.out.println("***************************");
		// create a map of country an population and sort countries in Alphabetical order
		
		Map <String, Integer> population=new TreeMap();
		
		population.put("USA", 333000000);
		population.put("India", 13260000);
		population.put("Afghanistan", 370000);
		
System.out.println(population);

System.out.println("****************");

HashMap <String, String> hmap=new HashMap<>(); 

hmap.put("Amily", "Amily");
hmap.put("Bob","Bob");
hmap.put("Zip","Zip");
hmap.put("City", "city");

System.out.println(hmap);// no order in printing



	}

}
