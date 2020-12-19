package assignments.day_4;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter medium and distance");
		String medium=sc.next();
		int distance=sc.nextInt();
		int time=0;
		
		switch(medium) {
		
		case "Air":
			time=distance/1100;
			break;
		case "Water":
			time=distance/4900;
			break;
		case "Steel":
			time=distance/16400;
			break;
			default: 
				System.out.println("Invalid parameters");
		}
		
		System.out.println(medium+" will take "+time+" second that a sound wave will travel in the medium in "+distance+" feet");
		
	}

}
