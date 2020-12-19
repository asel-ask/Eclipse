package a_reviiew.Week10;

import java.util.Scanner;

public class StringPractice1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstName=sc.next();
		
		sc.nextLine();
		
		System.out.println("Enter your last name");
		String lastName=sc.nextLine();
		sc.close();
		
		firstName=firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
		lastName=lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
		
		
		System.out.println("Firts name: "+ firstName);
		System.out.println("Last name: "+lastName);
		
		String fullName=firstName+" "+lastName;
		System.out.println("Full name: " +fullName);
		
		

	}

}
