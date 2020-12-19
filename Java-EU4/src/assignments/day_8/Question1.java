package assignments.day_8;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		plus();
	}
	public static void plus() {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first number :");
		int num1=s.nextInt();
		System.out.println("Enter second number : ");
		int num2=s.nextInt();
		int sum=num1+num2;
		System.out.println("Result: "+sum);
	}
}
