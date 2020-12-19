package day16_classObjects;

public class Cellphone {
	
	String brand;
	double screenSize;
	String color;
	double price;
	
	public void call() {
		System.out.println("calling");
	}
	public void message() {
		System.out.println("Sending text message");
	}
	public void takeAphoto() {
		System.out.println("Taking a photo");
	}
}
