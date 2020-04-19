package com.syntax.class29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class InterviewQuestion {

	public static void main(String[] args) {
		

		// how to remove duplicates from ArrayList
		
		List<String> alist=new ArrayList<>();
		alist.add("John");
		alist.add("Jane");
		alist.add("James");
		alist.add("Jasmine");
		alist.add("Jane");
		alist.add("James"); //--> here in arrayList we will get all the elements. 
		
		
		Set <String> set=new LinkedHashSet<>();
		set.addAll(alist);
		set.add("Alijon");
		set.add("Usman");
		
		// how to get one value from set?
		
		if (set.contains("Jasmine")) {
			System.out.println(set);
		}
		System.out.println("***********************");
		
		// 1. convert to list
		List <String> list=new ArrayList<>(set);
		
		String name=list.get(4);
		System.out.println(name);
		
		System.out.println("**********************");
		// convert to array
		
		Object [] array= set.toArray();
		System.out.println(array [5]);
		
		// Arrays is a utility class!!!!that has methods to work with arrays
		Arrays.sort(array);
		System.out.println(set); // ----> why it didnt work??????? why we cannot write array? we can use set, list
		
		
		
		System.out.println("**************************");
		// to sort elements of any collection
		
		// Collections is a utility class!!!!that has methods to work with collections

		Collections.sort(list); //---> you need to use class name. 
		System.out.println(list);
		
		
		

	}

}
