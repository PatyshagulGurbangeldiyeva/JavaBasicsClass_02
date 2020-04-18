package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRecap {

	public static void main(String[] args) {
	
		// create ArrayList that stores Double type of objects
		// create generic---> all collections can be generic or non generic
		
		//1. GENERIC COLLECTION/ ARRAYLIST
		ArrayList <Double> alist=new ArrayList<>();
		alist.add(10.99);
		alist.add(24.5);
		alist.add((double) 2);// --> here we wrote int type but we want double
							// so you need to make it double or convert it to double

		System.out.println(alist);// printing all the elements in array
		alist.set(1, (double) 30); // here we are replacing element (first write index then the numbers that you want)
	
		System.out.println(alist);
	
		alist.remove(30.0); // we are removing obj or element
		System.out.println(alist);
		System.out.println();
		System.out.println(alist.get(1));// ---> here we are getting element by using index number
		
		System.out.println("retreiving all elements");
		
		System.out.println();
		// retriving single element
		// retrieving all elements
		
		System.out.println("a. using enhanced for loop");
		for (double a:alist) {
			System.out.print(a);
			
		}
		System.out.println();
		System.out.println("b. using for loop");
		
		for (int i=0; i<alist.size();i++) {
			double d=alist.get(i);
			System.out.println(d);
		}
		System.out.println();
		
		System.out.println("c. Iterator");
		Iterator <Double> iterator=alist.iterator(); //--> by using iterator we can get obj 
												// --> when we are iterating we need to utilize!!
		// it is kind of getting all the elements like for loop!!
		while (iterator.hasNext()) {// we use hasNext()--> in order to understand does iterator have next element
			double d=iterator.next();
			System.out.println(d);
		}
		
		//2. NON GENERIC COLLECTION/ ARRAYLIST
		
		ArrayList obj=new ArrayList();//--> here we did not specify the type. we did not use <String and etc>
	
		obj.add("hello");
		obj.add('d');
		obj.add(3);
		obj.addAll(alist);
		System.out.println(obj);
		
		System.out.println();
		
		System.out.println("retrieving elements from non generic collection");
		
		for (Object a:obj) {
			System.out.print(a+" ");
		}
	
	}

}
