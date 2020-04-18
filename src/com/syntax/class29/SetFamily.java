package com.syntax.class29;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetFamily {

	public static void main(String[] args) {
		
		Set <String> veggies= new HashSet<>(); 
		
		// HashSet(no order) 
		
		veggies.add("carrot");
		veggies.add("tomatoe");
		veggies.add("cucumber"); // hashSet doesn't have the order
		veggies.add("patatoe");
		veggies.add("eggplant"); // as we know duplicators objs are not allowed. so we don't need to add twice the object
		
		System.out.println(veggies);// --- change the obj type new Hashset to other sets and you will see differences in printing
		System.out.println("*******************");
		
		
		// LinkedHashSet --> will have the order as we declared veggies.add
		Set <String> fruit= new LinkedHashSet<>(); 
		fruit.add("apple");
		fruit.add("watermelon");
		fruit.add("melon");
		fruit.add("pear");
		fruit.add("pear");
		fruit.add("orange");// no duplicates will be printed
		
		System.out.println(fruit);
		System.out.println("*********************");
		
		
		// TreeSet ---> here will have alphabetic order when we will print it
		Set <String> food= new TreeSet<>(veggies);// --> here we are passing (veggies) another collection to the class that we are creating
		// <Object> or we can write it here so we can add different obj type									// 
		food.addAll(fruit); // we can add another collection to the created class in this way too
	//	food.add("hamburger");
	//	food.add("lahmacun");----> you can add new food objs or just print the objs that you added from other class
		
System.out.println(food);
	}

}
