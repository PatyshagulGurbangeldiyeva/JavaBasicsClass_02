package com.syntax.class33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1WithString {

	public static void main(String[] args) {
		 /* How would handle InputMismatchException? 
		  * Input Mismatch Exception when user enters mismatch value then programmer expected.
		  */
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter the word");
		
		String str="";
		
		try {  //---> ime=new InputMisMatch();
				str.equals(input.nextLine());
				System.out.println(str);
				
				

		}catch (InputMismatchException ime) {
			ime.printStackTrace();
			System.out.println(ime);
			System.out.println(ime.getMessage());
		}
		
	}

}
