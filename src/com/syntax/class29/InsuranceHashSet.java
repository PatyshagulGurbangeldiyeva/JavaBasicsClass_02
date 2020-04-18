package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;

public class InsuranceHashSet {

	public static void main(String[] args) {
		
		HashSet <Insurance> hset= new HashSet<>();
		
		hset.add(new Car("Geico", "BMW", 6000));
		hset.add(new Pet("Pet Insurance", "cat", 150));
		hset.add(new Health("Ambetter", 55,100 ));
		
		System.out.println(hset.size()); // --> it will print the size of collection
		
		Iterator <Insurance> it=hset.iterator();
		
		while(it.hasNext()) {
			
			
			
			Insurance obj =it.next();// first get the obj and store it
			
			// hset.add(new Car("Geico", "BMW", 6000)); ---> first element that iterator chose
			
			obj.getInsurance();// -> then call the methods after you store in obj 
			obj.getQuote();
			System.out.println("********************");
			
		}
	

	}

}
