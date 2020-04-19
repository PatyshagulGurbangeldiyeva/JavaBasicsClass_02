package com.syntax.class29;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {
		
HashMap <String, String> hmap=new HashMap<>(); // we add key and value from the notebook

hmap.put("Name", "John");
hmap.put("Last Name","Smith");
hmap.put("Address","North Shiloh");
hmap.put("City", "Garland");

// what kind of methods available in map??

// 1. how to check does map have any values?
boolean isEmpty=hmap.isEmpty();
System.out.println("Is my hmap is empty? "+isEmpty);

System.out.println("******************************");
//2. how we can find how many elements is Map?

int size=hmap.size();
System.out.println(size); //---> it gives the number of entries

// can we add more values to Map?
hmap.put("Zipcode", "23466");
System.out.println(hmap);

// can we store duplicate keys? NO, the previous values will pe replaced

hmap.put("Name", "Jane");
System.out.println(hmap); // there is no order while printing

System.out.println("*****************************");

// how access the value?--> use method get and specify the key
System.out.println(hmap.get("Name"));

// can we remove the value? yes
hmap.remove("Address");
System.out.println(hmap);

System.out.println("********************");
// can we replace the value? yes

System.out.println(hmap);
hmap.replace("City", "Richerdson"); // the uppercase must be similar with the key that you declared before!!!!
System.out.println(hmap);

	}

}
