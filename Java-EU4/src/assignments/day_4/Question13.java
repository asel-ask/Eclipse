package assignments.day_4;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of checks written for the month");
		int checks=s.nextInt();
		int baseFee=10;
		double checkFee=0;
		
		if(checks<20) {
			checkFee=checks*0.10;
		}else if(checks>=20 && checks<40) {
			checkFee=checks*0.08;
		}else if(checks>=40 && checks<60) {
			checkFee=checks*0.06;
		}else 
			checkFee=checks*0.04;
		
		 
		System.out.println("Service fees for the month : $"+(baseFee+checkFee));
	}

}
