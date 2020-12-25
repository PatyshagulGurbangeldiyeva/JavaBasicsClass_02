package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AllMaps {

	public static void main(String[] args) {
		// lets create a grocery map (item, quantity) in which we don't need to care about the order
		
		Map <String, Integer> grocery=new HashMap<>();
		
		grocery.put("milk", 1);
		grocery.put("cucumber", 3);
		grocery.put("banana", 12);
		grocery.put("cheese", 2);
		grocery.put("grapes", 3);
		
		System.out.println(grocery);// the order will not be while printing as we used HashMap
		
		System.out.println();

		
		// create a map of items to buy (item, quantity) in which we want save the order
		
		Map <String, Integer> household= new LinkedHashMap<>();
		household.put("lysol", 2);
		household.put("sanitizer", 2);
		household.put("paper towe", 3);
		household.put("toilet paper", 10);
		household.put("face mask ", 50);

		System.out.println(household);// --> will be printed as we declared order
		
		System.out.println();
		
		// create a map in which we store all previous items in ascending order
		
		Map <String, Integer>shopping= new TreeMap(grocery);//--> here we are adding all the things that we add into linkedMap and  HashMap
		
		shopping.putAll(household);
		
		System.out.println(shopping);//--> will be printed in alphabetic order 
		
		System.out.println();
		
		System.out.println("to get all keys: we use keySet();");//-- > here we are working with the last Map shopping as all the maps there
		
// 		Set <String> keys=shopping.keySet();// we are using keySet method and storing it in the SET. we can use like this or write it in for enhanced loop
		
		for (String key:shopping.keySet()) {
			System.out.println("key: "+key);
		}
		
		System.out.println();
		
		System.out.println("to get all keys by using ITERATOR");
		
		Iterator <String> it=shopping.keySet().iterator();  // first you need to convert the map to collection. as Set is the type of collection then we can iterate it
		while (it.hasNext()) {
			System.out.println("key "+it.next());
		}
		
		System.out.println();
		
		System.out.println("Getting all values we use: map.values();");
		
		// get all values by using for enhanced loop
		
		for (int v: shopping.values()) {
			System.out.println("velue: "+v);
		}
		
		System.out.println();
		
		System.out.println(" getting all values using iterator");
		
		Iterator <Integer> valIt=shopping.values().iterator();
		
		while (valIt.hasNext()) {
			System.out.println("value: "+valIt.next());
		}
	}

}
