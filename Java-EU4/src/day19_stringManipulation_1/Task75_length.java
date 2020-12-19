package day19_stringManipulation_1;

import java.util.Scanner;

public class Task75_length {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your firstname and lastname");
		String firstName=sc.next();
		String lastName=sc.next();
		
		System.out.println("Total characters in your first name and last name: "+(firstName.length()+lastName.length()));
	}

}
