package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListAndIterator {

	public static void main(String[] args) {
		// create arrayList of chocolates
		

		ArrayList <String> choco=new ArrayList<>();
		choco.add("kinder");
		choco.add("kit kat");
		choco.add("snikers");
		choco.add("godiva");
		
		
		// create arrayList of sweets
		// add chocolate collection
		// find the size
		// print all the elements after adding new collection
		
		ArrayList <String> sweets=new ArrayList<>();
		sweets.add("ice cream");
		sweets.add("cheese cake");
		sweets.addAll(choco);
		System.out.println(sweets.size());
		System.out.println(sweets);
		System.out.println();
		
		System.out.println("using iterator");
		// iterating through the collection
		
		Iterator <String> it=sweets.iterator();
		
		 if (it.hasNext()) {  // first method of iterator
			 String element=it.next(); // second method of iterator
			 if (element.equals("ice cream")) {
				 it.remove(); // third method of iterator
			 }
			 
		 }
		 System.out.println(sweets); // after removing elements we are printing
		 
		 // retrieving elements from backwards--> we cannot use for enhanced and iterator
		                                     // they just work one direction
		 for (int i=sweets.size()-1; i>=0; i--) {
			 System.out.print(sweets.get(i)+", ");
		 }
	}

}
