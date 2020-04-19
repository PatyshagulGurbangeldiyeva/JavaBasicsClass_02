package com.syntax.class29;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class CitiesSet {

	public static void main(String[] args) {
		
/*Create a Set of cities in which you want to make sure that insertion order is maintained. 
 *Using Iterator remove any city that starts with “A”;
 */

		Set <String> cities=new LinkedHashSet<>();
		cities.add("Garland");
		cities.add("LA");
		cities.add("New York");
		cities.add("Ahgabat");
		cities.add("Almaty");
		cities.add("Utah");
		
		System.out.println("******** USING PRINT FOR PRINTING IN ARRAY ************");
		cities.remove("Ashgabat");
		cities.remove("Almaty");
		System.out.println(cities);//--> printing in []
		
		System.out.println();
	
	
		 System.out.println("******** USING ITTERATOR ************");
		 
		 Iterator <String> it=cities.iterator();
		 
		 while(it.hasNext()) {
		if(it.next().startsWith("A")) {
			it.remove();
		}
		
		 }
		 System.out.println(cities);
	}

}
