package lab.lab_3;

public class Q1 {

	public static void main(String[] args) {
		
		System.out.println(helloName("Bob"));
		System.out.println(helloName("Alice"));
	}
	public static String helloName(String name) {
		
		return "Hello ".concat(name).concat("!");
	}
}
