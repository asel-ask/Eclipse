package assignments.day_4;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Please input month, day and a two-digit year");
		int month=sc.nextInt();
		int day=sc.nextInt();
		int year=sc.nextInt();
		
		if(day*month==year) {
			System.out.println("The date is magic");
		}else 
			System.out.println("The date is not magic");

	}

}
