package a_reviiew.Week5;

public class MethodOverloading {

	public static void main(String[] args) {

		addNumber(100);
		addNumber(100,200);
		addNumber(100d,200d);
		addNumber(100, 200, 300);

	}
	
	public static void addNumber(int num) {
		System.out.println("The result is "+(num+10));
		
	}
	
	public static void addNumber(int num1,int num2) {
		System.out.println("The result is "+(num1+num2));
	}
	public static void addNumber(double num1,double num2) {
		System.out.println("The result is "+(num1+num2));
	}
	public static void addNumber(int num1,int num2,int num3) {
		System.out.println("The result is "+(num1+num2));
	}
	
}
