package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {

	public static void main(String[] args) {
		
		// store flowers into array
		
		Flower [] flowers= {new Tulip("Tulip"), new Rose("Rose"), new SunFlower("Sunflower")};
		
		// store flowers into arrayList
		
		ArrayList <Flower> flower=new ArrayList<>(); // we are storing all the objects that are in Flower type

		flower.add(new Tulip("Tulip"));
		flower.add(new Rose("Rose"));
		flower.add(new SunFlower("SunFlower")); // we are adding an obj
												// flower.add("Rose");---> here we are storing obg in String type
												// so right now ArrayList is a collection of obj types
		
		// call availbe methods by using:
		// 1. for loop
		// 2. advanced for loop
		// 3. iterator
		
		System.out.println(flower);
		

	}

}
