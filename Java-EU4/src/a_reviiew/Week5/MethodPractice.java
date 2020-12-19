package a_reviiew.Week5;

public class MethodPractice {

	public static void main(String[] args) {
		
		sayHello();
		sayHello();
		sayHelloTo("Ali");
		
	}
	public static void sayHelloTo(String name) {
		System.out.println("Saying hello to "+name);
	}

	public static void sayHello() {
		System.out.println("Hello from Cybertek!");
		System.out.println("Welcome to Cybertek!");
	}
}
