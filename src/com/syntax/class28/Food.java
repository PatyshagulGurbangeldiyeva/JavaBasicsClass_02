package com.syntax.class28;



public abstract class Food {
	/*create food class that will have 3 undefined methods 
	 *and it will have 4 subclasses; 
	 *create a collection of food 
	 *and using 3 ways execute methods
	 */
	String ingrediants;
	String nameOfFood;
	int colories;
	
	Food (String nameOfFood, String ingrediants, int colories){
		this.nameOfFood=nameOfFood;
		this.ingrediants=ingrediants;
		this.colories=colories;
	}
	public abstract void boil();
	
	public abstract void cook();
	
	public abstract void grill();
	

}

class Soup extends Food{
	
	Soup(String nameOfFood, String ingrediants, int colories) {
		super(nameOfFood, ingrediants, colories);
		
	}

	public void boil() {
		System.out.println("Soup can be boiled");
	}

	@Override
	public void cook() {
		System.out.println("Soup can be cooked");
		
	}

	@Override
	public void grill() {
		System.out.println("Soup can't be grilled");
			
	}
	
}
class Meat extends Food {

	Meat(String nameOfFood, String ingrediants, int colories) {
		super(nameOfFood, ingrediants, colories);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void boil() {
		System.out.println("Meet can't be boiled");
		
	}

	@Override
	public void cook() {
		System.out.println("Meet can be cooked");
		
	}

	@Override
	public void grill() {
		System.out.println("Meet can be grilled");
		
	}
}
	
class Aspragus extends Food {

		Aspragus(String nameOfFood, String ingrediants, int colories) {
		super(nameOfFood, ingrediants, colories);
		// TODO Auto-generated constructor stub
	}

		@Override
		public void boil() {
			System.out.println("Aspragus can't be boiled");
			
		}

		@Override
		public void cook() {
			System.out.println("Aspragus can be cooked");
			
		}

		@Override
		public void grill() {
			System.out.println("Aspragus can be grilled");
			
		}
		
	}
	
	class Chiken extends Food {

		Chiken(String nameOfFood, String ingrediants, int colories) {
			super(nameOfFood, ingrediants, colories);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void boil() {
			System.out.println("Chiken can be boiled");
			
		}

		@Override
		public void cook() {
			System.out.println("Chiken can be cooked");
			
		}

		@Override
		public void grill() {
			System.out.println("Chiken can be grilled");
			
		}
		
	} 
	
