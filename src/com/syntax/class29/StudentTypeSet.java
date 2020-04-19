package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTypeSet {

	public static void main(String[] args) {
		/* Create a Set collection that will hold Objects of Student Type. 
		 * In this set we do not care about the insertion order. 
		 * Each student object should have name and studentID. Display name of each student.
		 */

		Set <St> st=new HashSet<>();
		
		st.add(new St("John", "ua12345"));
		st.add(new St("Chloe", "u98k7"));
		
//		Iterator <St> it=st.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next().display());
//		}
//		
	
	
	for (St s:st) {
		s.display();
	}
	
	}

}

