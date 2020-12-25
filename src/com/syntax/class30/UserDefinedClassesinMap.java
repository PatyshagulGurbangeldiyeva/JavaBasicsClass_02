package com.syntax.class30;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class Store{
	String type, name;
	
	public Store (String name, String type){
		this.name=name;
		this.type=type;	
	}
	
	public abstract void workingHours();
	
	public void display() {
		System.out.println("this is "+name);
	}
	
}

class Nike extends Store{
	
	Nike(String name, String type){
		super(name, type);
	}

	@Override
	public void workingHours() {
		System.out.println(name+"  works from 9am to 6pm");
		
	}
}
class Costco extends Store{

	public Costco(String name, String type) {
		super(name, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void workingHours() {
		System.out.println(name+" store  works from 10am till 7pm");
		
	}
	
}

class Amazon extends Store {

	public Amazon(String name, String type) {
		super(name, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void workingHours() {
		System.out.println(name+" store  works 24/7");
		
	}
	
}




public class UserDefinedClassesinMap {
	
	
	public static void main(String[] args) {
		// we want to store stores in form ---> 1.amazon, 2.costco, 3.nike
		
		Map <Integer, Store> storeMap=new LinkedHashMap<>();
		
		storeMap.put(1, new Amazon("Amazom" , "Online store")); //---> here we put the class and constructor in it
		storeMap.put(2, new Costco("Costco", "Wholesale"));
		storeMap.put(3, new Nike("Nike", "Sport wear"));
		
		// execute the methods
		
		// in order to get methods first we need to get objects
		
		// to get an access to all methods of our STORE OBJECTS WE CAN USE: .values(), keySet(),entrySet()

		System.out.println("getting all values by using collection");
		System.out.println();
		
		Collection <Store> col=storeMap.values();
		
		for (Store store:col) {
			store.workingHours();
			store.display();
			System.out.println();
		}
		System.out.println("*******************");
		
		
		System.out.println("getting all Entry objects by using entrySet()");
		System.out.println();
		
		Set <Entry <Integer, Store>>storeSet=storeMap.entrySet();// --> look to the store map (int, Store class)
		
		for (Entry<Integer, Store>entry:storeSet) {
			entry.getValue().workingHours();// as we are interested in value not in key--> we are getting methods
			entry.getValue().display();
			System.out.println();	
			}
		
		System.out.println("**********************");
		
		System.out.println("get all keys and from the key get values/ for enhanced loop");
		System.out.println();
		
		Set <Integer> keys=storeMap.keySet();
		for (Integer key:keys) {
			// how with the help of key we can get the value??
			storeMap.get(key).workingHours();
			storeMap.get(key).display();
			System.out.println("----------------");
			Store obj=storeMap.get(key); // ----> what type of value you will get--> here we will get store (obj)
			obj.display();
			obj.workingHours();
			System.out.println();
		}
		
		System.out.println("*************************");
		System.out.println("get all keys and from the key get values");
		}
		}


