package day13_methods_part1;

public class Task58_greaterNumber {

	public static void main(String[] args) {

		greaterNumber();

	}
	
	public static void greaterNumber() {
		int num1=100,num2=200,greater;
		greater=(num1>num2) ? num1 : num2;
		System.out.println(greater+" is greater");
		
	}
}
