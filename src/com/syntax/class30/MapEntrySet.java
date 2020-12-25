package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntrySet {

	public static void main(String[] args) {
		
		// create a map that will store month and days in o month
		
	
		Map <String, Integer> month=new LinkedHashMap<>();
		
		month.put("January", 31);
		month.put("February", 28);
		month.put("March", 31);
		month.put("April", 30);
		
		System.out.println(month.size());// gives number of entries
		
		System.out.println();
		
		
		
		// get all entries from the map 
		
		Set <Entry <String, Integer>> entries=month.entrySet();
		
		System.out.println("loop through all objects ");
		
		for (Entry <String, Integer> e:entries) {
			System.out.println("entry: "+e);
		}
		
		System.out.println();
		
		System.out.println("second way of using for each loop/ by gettig key and values");
		
		for (Entry <String, Integer> en:entries) {
			System.out.println(en.getKey()+":"+en.getValue());
		}
		System.out.println();
		
		System.out.println("getting entries via iterator");
		
		Iterator <Entry<String, Integer>> enIt=entries.iterator();
		
		while(enIt.hasNext()) {
			System.out.println("the key and the value is:" +enIt.next());
		}
		
		System.out.println();
		
		System.out.println("second way of using iterator/ by gettig key and values");
		
		Iterator <Entry<String, Integer>> it=entries.iterator();
		
		while (it.hasNext()) {
	//		System.out.println("Key: "+it.next().getKey()+" value; "+it.next().getValue());
		//  it will give mistake run time. as first line will be printed the key then it will go next line and print value
		// so we need to make enty single
			
			Entry <String, Integer> entry=it.next();
			System.out.println(entry.getKey()+"=="+entry.getValue());
		
		
		}
		
	}

}
