package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TaskEntry {

	public static void main(String[] args) {
		// Create a map of Best Buy store. 
    	// Place item id and item name into it. 
		//Example (7664847 = Printer, 7879885= TV etc )
	   //Retrieve all keys and values from a Best Buy map using EntrySet.
		
		Map <String, String> bestBuy= new LinkedHashMap<>();
		bestBuy.put("239583","Printer");
		bestBuy.put("23462i", "TV");
		bestBuy.put("6742UY", "Screen");
		bestBuy.put("i7986", "Playstation");
		
		Set <Entry<String,String>> values=bestBuy.entrySet();
		
for (Entry <String, String> v:values) {
	System.out.println("the key: "+v.getKey()+" and the value is "+v.getValue());
	
}
		
System.out.println();

System.out.println("second way of using for enhanced");

for (Entry <String, String> v:values) {
	
	System.out.println(v);
}

System.out.println();

System.out.println("using iterator");
Iterator <Entry <String, String>> it=values.iterator();

while (it.hasNext()) {
	Entry <String, String> entry=it.next();
	System.out.println("the key is: "+entry.getKey()+"and the values is: "+entry.getValue());
	
}

System.out.println();
System.out.println("second way of using iterator");

Iterator <Entry <String, String>> enIt=values.iterator();
while(enIt.hasNext()) {
	System.out.println(enIt.next());
}
	}

}
