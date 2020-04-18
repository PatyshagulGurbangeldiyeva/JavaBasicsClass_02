package com.syntax.class27;

public abstract class Flower {
// define flower class that will have string type constructor, 
	
// that initializes variable and undefined method bloom
	
	public String type;
	public  Flower(String type){
		this.type=type;
	}
	
	public abstract void bloom();

}
class Tulip extends Flower{
	public Tulip(String type) {
		super(type);
	}

	@Override
	public void bloom() {
		System.out.println(type+" blooms at the end of Spring");
		
	}
}
class Rose extends Flower{
	public Rose (String type) {
		super(type);
	}

	@Override
	public void bloom() {
		System.out.println(type+" blooms in the beginning of the Spring");
		
	}
}
class SunFlower extends Flower{
	SunFlower (String type){
		super (type);
	}

	@Override
	public void bloom() {
		System.out.println(type+" blooms in Summer");
		
	}
}
