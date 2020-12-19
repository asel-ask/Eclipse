package day9_ControlFlowStaements_3;

import java.util.Scanner;

public class TheScannerName {
	public static void main(String[] args) {

		//ask user for name
		// and capture the result 
		//print your name as it is
		//ask user for birth year
		//and capture the result 
		//print the age 
		//ask user for height 
		//and capture the result
		//print the height
		
		//create Scanner object
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("What is your name : ");
		//String name="Sam";
		String name=scan.next();
		System.out.println("My name is "+name);
		
		System.out.println("What is birth year : ");
		
		int birthYear=scan.nextInt();
		int age = 2020-birthYear;
		
		System.out.println("My age is "+age);
		
		System.out.println("What is your height ?" );
		
		double height=scan.nextDouble();
		
		System.out.println("My height is "+height);
		
		System.out.println("Are you recording?");
		
		boolean isRecording=scan.nextBoolean();
		
		System.out.println("It is "+isRecording);
		
		
		
		
	}

}
