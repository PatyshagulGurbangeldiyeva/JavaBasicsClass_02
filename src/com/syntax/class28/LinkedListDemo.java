package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		
		// how to create linkedList and obj there?
		
		LinkedList <String> llist=new LinkedList<>();
		llist.add("Yunus"); //comes from collection --> this method add() available to all collection
		llist.add(0, "Reyhan");  // comes from list---> this method add(index, element) available within the list we are changing index0(yunus) to reyhan
		llist.add("Pavel");
		llist.add("Farid");
		llist.add("Farid");
		llist.add("Farid");
		
		int size=llist.size();
		System.out.println(size);// --> here we had answer 6 as wechanged Yunus to Reyhan
		
		
		System.out.println("********");
		
		// get elements 1 by 1 in 3 different way
		System.out.println("first way");
		for (int i=0; i<llist.size();i++) {
			System.out.print(llist.get(i)+" ");
			
			
		}
		System.out.println();
		System.out.println("************");
		System.out.println("getting elements in []");
		 System.out.println(llist); // we are getting all elements in the array []
		 
		 System.out.println("second way");
		 
		 for (String elements:llist) {
			 System.out.print(elements+" ");
		 }
		 System.out.println();
		 System.out.println("third way");
		 Iterator <String> it=llist.iterator();
		 
		 while (it.hasNext()) {
			String element=it.next();
			System.out.print(element+" ");
		 }
		 
		 // can we store of user defined classes---> yes we can
		 
		 LinkedList <Food> food=new LinkedList <>();	// here we are storing our obj in parent class List
		 										// if you want to get everything from that class Food's subclasses must be public too!!
		 
		 food.add(new Soup ("soup", "tomatoe and onion",200));
		 food.add(new Meat("meat", "meat and onion", 250));
		 food.add(new Aspragus("aspragus", "aspragus", 50));
		 
		 for (Food f:food) {
			 f.boil();
			 f.grill();
			 f.cook();
			 
			 System.out.println("****************");
		 }
		 
		
	}

}
