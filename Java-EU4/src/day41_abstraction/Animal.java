package day41_abstraction;

public abstract class Animal {
	
	String name;
	
	public Animal() {
		
	}
	
	public Animal(String name) {
		this.name=name;
		}
	
	public abstract void eat(String str) ;		//Abstract method
	public abstract void breathe();		//Abstract method
	
	public void move() {				//Instance method
		System.out.println("Moving");
	}
}
