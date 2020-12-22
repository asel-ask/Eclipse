package day41_abstraction;

public abstract class Bird extends Animal{

	/*
	@Override
	public void eat() {
		System.out.println("Bird eating");	
	}*/

	@Override
	public void breathe() {
		System.out.println("Bird breathing");
		
	}

	public abstract void fly();
	
}
