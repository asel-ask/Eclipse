package assignments.day_4;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		System.out.println("enter year");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
	
		if (year%4==0) {
			if(year%400==0) {
				System.out.println("Leap year");
				return;
				}
			if (year%100==0) {
				System.out.println("Not a leap year");
				return ;
				}
		System.out.println("Leap year");
		
		}else {System.out.println("Not a leap year");
		}

		


	}

}
