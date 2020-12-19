package assignments.day_4;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {

		Scanner i =new Scanner(System.in);
		System.out.println("Enter letter of the package and the number of hours that were used");
		String letter= i.next();
		double hours=i.nextDouble();
		double payment=0;
		switch(letter) {
		
		case "A":
			if(hours<=10) {
			payment=9.95;
			}else {
				payment=9.95+(hours%10)*2;
			} break;
		case "B":
			if(hours<=20) {
				payment=13.95;
				}else {
					payment=13.95+(hours%20)*1;
				} break;
		case "C":
				payment=19.95;
				 break;
		}
		
		System.out.println("Total charges: $"+payment);
	}

}
