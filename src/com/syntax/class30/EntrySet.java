package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EntrySet {

	public static void main(String[] args) {
		
		Map <String, String> land=new TreeMap<>();
		
		land.put("Togo", "Lome");
		land.put("Jamaica", "Kingston");
		land.put("Iran", "Tehran");
		land.put("Peru", "Lima");
		land.put("Cuba", "Havana");
		
		System.out.println(land);
		
		System.out.println();
		
		// storing all entry obj into a set
		Set <Entry <String, String>> allEntries=land.entrySet();// in order to get entry
		System.out.println(allEntries);
		
		// through the iterator we can get access to the methods getKey() and getValue()
		
		
		
		System.out.println();
		System.out.println("using for enhanced loop");
		
		for (Entry<String, String> entr:allEntries) {
			System.out.println(entr);
			
			System.out.println("keys in the entry:"+entr.getKey());
			
			System.out.println("values in the entry: "+entr.getValue());
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("using iterator to call all entries");
		
		// we can iterator just in collection. so your map must be converted to the Set(collection type)
		
		
		Iterator <Entry<String, String>> it=allEntries.iterator();
		
		while (it.hasNext()) {
			Entry <String, String> e=it.next();
			System.out.print(e.getKey()+" ");
			e.getValue();
		}
	}

}
