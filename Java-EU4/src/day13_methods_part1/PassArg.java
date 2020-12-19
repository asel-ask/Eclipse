package day13_methods_part1;

public class PassArg {

	public static void main(String[] args) {
		
		int x=20;
		displayValue(10);
		displayValue(x);
		displayValue(x*4);

	}

	public static void displayValue(int num) {
		 System.out.println("The value is " + num);
	}
	
}
