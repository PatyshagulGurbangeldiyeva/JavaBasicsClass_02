package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class GettingMap {

	public static void main(String[] args) {
		
Map <Integer, String>building=new TreeMap<>(); //----> sorting obj according to key order
		
building.put(7, "Safari");
building.put(1,"Google");
building.put(6, "Battle");
building.put(3, "FireFox");
building.put(4, "Cyberteck");
building.put(5, "Coding");
building.put(2,"Syntax");
building.put(4, "Cyberteck");

System.out.println(building.size());//--> getting how many floors there
		
System.out.println(building);

System.out.println("*****************");

// how to get all keys

Set <Integer> keys=building.keySet();//--> here we are getting a set (collection)
System.out.println(keys);

System.out.println();

System.out.println("***** getting all keys using iterator ***********");

Iterator <Integer> keysIt=keys.iterator();

while (keysIt.hasNext()) {
	int key=keysIt.next();
	
	// key is ___ and its value is google --> we want to say. how can we get the key's value
	
	System.out.println("Key is "+key+" its value is "+building.get(key));
}
	
	System.out.println();
	
	System.out.println("******* getting all keys by using for each loop ***********");
	
	for (Integer k:keys) { //--> instead of Integer you can use int as unboxing, making Integer obj int primitive
		System.out.println("Key from building map "+k+": "+building.get(k));
													    // in order to get values we  used building.get(k)
	
	
	
	}
	System.out.println();
	
	// how to get all the values?
	
	Collection <String> values=building.values();//--> so here we have collection and we can get all the methods from collection
	
	System.out.println("************ getting all values using for each loop **********");
	
	for (String v:values) {
		System.out.println("values from collection: "+v);
	}
	
	System.out.println("****** using iterator *********");
	
	Iterator <String> valIt=values.iterator(); //--> here we used values.iterator as we are getting from collection
	while (valIt.hasNext()) {
		String next=valIt.next();
		System.out.println("Map values: "+next);
	}
}
	}

