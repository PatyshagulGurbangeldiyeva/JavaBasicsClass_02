package com.syntax.class29;


public abstract class Insurance {

	/* Create a class Insurance 
	 * that will have an attribute as insuranceName and unimplemented behavior as getQuote and cancelInsurance. 
	 * Create 3 subclasses Car, Pet, Health.
	 * Car class has it’s own attribute as carModel 
	 * and Class Pet has petType attribute. 
	 * Create 3 objects of the sub classes and store them in ArrayList. 
	 * Using for loop/advanced for loop/ iterator access all methods of the class
	 */
	
	String insuranceName;
	Insurance (String insuranceName){
		this.insuranceName=insuranceName;
	}
	public abstract void getQuote();
	public abstract void getInsurance();
}
class Car extends Insurance{
	
	String carModel;
	double payment;
	
	Car( String insuranceName, String carModel,double payment ){
		super(insuranceName);
		this.carModel=carModel;
		this.payment=payment;
	}

	@Override
	public void getQuote() {
		System.out.println(insuranceName+" for car model "+carModel+" your monthly payment is "+payment+"and 6 months total premium is "+(payment*6));
		
		
	}

	@Override
	public void getInsurance() {
		System.out.println("You can get" +insuranceName+" insurance next day");
		
	}
	
}
class Pet extends Insurance{
	String petType;
	double payment;
	
	Pet(String insuranceName, String petType, double payment){
		super(insuranceName);
		this.petType=petType;
		this.payment=payment;
	}
	@Override
	public void getQuote() {
		System.out.println(insuranceName+" insurance's quote for pet "+petType+" :your monthly payment is "+payment);
		
	}
	@Override
	public void getInsurance() {
		System.out.println("You can get "+insuranceName+" insurance after you provide us your pet's documents");
		
	}
}
	class Health extends Insurance{
		int age;
		double payment;
		Health(String insuranceName, int age, double payment){
			super(insuranceName);
			this.age=age;
			this.payment=payment;
	} 

	@Override
	public void getInsurance() {
		System.out.println("You can get "+insuranceName+" insurance after you provide us your salary documents");
		
	}

	@Override
	public void getQuote() {
		System.out.println(insuranceName+" insurance's quote according your age: "+age+" :your monthly payment is "+payment);
		
	}
	}

