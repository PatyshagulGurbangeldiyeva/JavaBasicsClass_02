package com.syntax.class29;

public abstract class StudentInfo {
	String name, id;
	StudentInfo(String name, String id){
		this.name=name;
		this.id=id;
	}
	public abstract void display();

}
class St extends StudentInfo{

	St(String name, String id) {
		super(name, id);
		
	}

	@Override
	public void display() {
		System.out.println(name+ "has id of "+id );
		
	}
	
}
