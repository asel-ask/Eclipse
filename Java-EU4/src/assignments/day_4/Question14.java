package assignments.day_4;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of book that you purchased this month");
		int numOfBook=s.nextInt();
		int points=0;
		switch(numOfBook) {
		case 0:
			points=0;
			break;
		case 1: 
			points=5;
			break;
		case 2:
			points=15;
			break;
		case 3:
			points=30;
			break;
		case 4: 
			points=60;
			break;
			default: 
				System.out.println("Invalid parameters");
		}

		System.out.println("Number of points awarded : "+points);
	}

}
