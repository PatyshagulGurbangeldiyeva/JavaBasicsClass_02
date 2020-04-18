package com.syntax.class26;

public class EncapsulationTest {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
	//	emp.name="djdohf45"// we providing name but we cannot get the instanse variable
							// as it is private, so we are using method to call name
		
		emp.setName("John"); // --> here we set the name
		System.out.println(emp.getName()); // here we get the name

	}

}
