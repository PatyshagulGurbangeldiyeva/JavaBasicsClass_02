package com.syntax.class33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1WithNumber {

	public static void main(String[] args) {
		/* How would handle InputMismatchException? 
		  * Input Mismatch Exception when user enters mismatch value then programmer expected.
		  */
		
		int num;
		
		Scanner input=new Scanner (System.in);
		
		System.out.println("please enter the number");
		
		try {
			num=input.nextInt();
			System.out.println(num);
		}catch (InputMismatchException me) {
    		me.printStackTrace(); //--->java.util.InputMismatchException
			System.out.println(me); //--->java.util.InputMismatchException
			System.out.println(me.getMessage()); //---->null
		}

	}

}
