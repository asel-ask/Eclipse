package self_practice;

import java.util.Scanner;

public class ex4_ValueOfFactorialNum {

	public static void main(String[] args) {
		// Write a program to find the factorial value of any number entered through the keyboard. 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter positive integer: ");
		int num=scan.nextInt();
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			
			fact*=i;
		}System.out.println("Factorial is: "+fact);

	}

}
