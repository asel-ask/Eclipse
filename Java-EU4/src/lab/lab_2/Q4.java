package lab.lab_2;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of males and females");
		int male=s.nextInt();
		int female=s.nextInt();
		int total=male+female;
		double mPercentage=(male*100)/total;
		double fPercentage=(female*100)/total;
		System.out.println("Males are "+mPercentage+"% of class\nFemales are "+fPercentage+"% of class");
		

	}

}
