package com.syntax.class26;

public class DoctorTest {

	public static void main(String[] args) {
		
		Doctor doc=new Doctor();
		doc.setEmail("doctor@hotmail.com"); // --> the answer will be according to the setEmail method
		System.out.println(doc.getEmail()); // --> the answer will be according to the getEmail method
											// as it is not satisfied the answer will be null, we did not declared in the method printing answer
											// because of that the answer is null

		System.out.println();
		
		doc.setEmail(""); 
		System.out.println(doc.getEmail());
		
System.out.println();
		
		doc.setEmail("doctor@yahoo.com"); 
		System.out.println(doc.getEmail());
		
System.out.println();
		
		doc.setEmail("doctor@gmail.com"); 
		System.out.println(doc.getEmail());
		
	}

}
