package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		// Create a collection that will store unique objects and order is not important
		
		// we use hasShet if it is not important the order, and Set is a unique 
		
		HashSet <String> breakfast= new HashSet<>();
		
		breakfast.add("eggs");
		breakfast.add("cheese");
		breakfast.add("coffee");
		breakfast.add("bread");
		breakfast.add("eggs");
		breakfast.add("tea");
		
		int size=breakfast.size();
		System.out.println(size); //---> the answer will be 5 as Set doen't allow duplicates!!!!!
		System.out.println(breakfast);//---> printing the set in the [] and the order will not same as we add!!!
		System.out.println();
//		breakfast.get();//---> Retrieving one element cannot be used in hashSet as elements index order is changing, as there is no order of elemets
		
		// but we can retrieve all elements by using iterator
		System.out.println("***** ITERATOR*********");
		Iterator<String> it=breakfast.iterator(); // retreiving elements one by one but the order will be different
		
		while (it.hasNext()) {
			System.out.println(it.next()); 
		}
		System.out.println("*****ENHANCED LOOP*******");
		
		for(String b:breakfast) {
			System.out.println(b);
		}

	}

}
