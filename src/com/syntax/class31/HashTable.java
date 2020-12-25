package com.syntax.class31;
import java.util.*;

public class HashTable {

	public static void main(String[] args) {
		
		
		// let's create countries with capitals
		
		Map <String,String> hmap=new HashMap<>(); // is non sycronized, not thread safe
		
		hmap.put("USA", "Washington DC");
		hmap.put("Russia","Moscow");
		hmap.put("France", "Paris");
		hmap.put("Italy", null); //====> we can store default (null) values in hashMap
		hmap.put(null, "Ashgabat");
		hmap.put(null, "Ankara"); //===> will replace the previous null key and will be printed this one. in Maps we don't have duplicate values
		System.out.println(hmap); // no insertion preserved as we used hashmap
		
		
		Map <String,String >htable=new Hashtable<>(); // is sycronized, thread safe
		
		htable.put("Brazilia", "Brazil");
		htable.put("Tajikistan", "Dushanbe");
	//	htable.put("Maxico", null);//=====> for a compiler it will be rigth, but when we run it there will be eroor. So null values are not permited in hasTbale!!
	//	htable.put(null,"Krim");//====> doesn't allow null keys
	
		System.out.println(htable);// no order as hasMap. just Hashtable the oldest class

		
		//first part of the code (thread)
		
		createMap("Azerbeyjan", "Baku");
		
		// second part of the code(thread)
		createMap("Georgia", "Tiblis"); //---> so these methods will go down and creat. if you used HashMap so there will be faster as multiple threads will go together and will be returned
										// --> but if you use hashtable then threads must wait till the first will finish the work
		
	}

	// thread safe and not safe meaning: it means that you can put your methods in different methods (threads) so running will be easy and faster.
	
	 static Map<String,String> createMap(String key, String value) {
		Map map=new HashMap<>();
		map.put(key, value);
		return map;
		
	}
	
}
