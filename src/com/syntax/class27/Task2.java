package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
	// Create an arrayList of words. Remove every word that ends with “e”. Use iterator
	
public static void main (String [] args) {
	
	ArrayList <String> words=new ArrayList();
	words.add("hello");
	words.add("elephant");
	words.add("escalator");
	words.add("cheese");
	
	
	
	Iterator <String> word=words.iterator();
	
	while (word.hasNext()) {
		if ( word.next().endsWith("e")) {
			word.remove();
		}
	
	}
	System.out.println(words);
}
}
