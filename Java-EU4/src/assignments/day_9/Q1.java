package assignments.day_9;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		 
		Scanner s= new Scanner(System.in);
		System.out.println("Split: ");
		boolean isSplit=s.nextBoolean();
		System.out.println("Number of people: ");
		int numberPeople=s.nextInt();
		System.out.println("Check amount: ");
		double checkAmount=s.nextDouble();
		System.out.println("Service Quality: ");
		String serviceQuality=s.next();
		tipCalculator(isSplit,numberPeople,checkAmount,serviceQuality);
	}

	public static void tipCalculator(boolean isSplit, int numberPeople, double checkAmount, String serviceQuality) {
		 
		double totalToPay;
		double totalTip = 0;
		
		switch(serviceQuality) {
		
		case "Poor":
			totalTip=checkAmount*0.05;
			break;
		case "Fair":
			totalTip=checkAmount*0.10;
			break;
		case "Good":
			totalTip=checkAmount*0.15;
			break;
		case "Great":
			totalTip=checkAmount*0.20;
			break;
		case "Excellent":
			totalTip=checkAmount*0.25;
			break;
			default:
				System.out.println("Invalid Service Quality");
		} 
		System.out.print("Number of people entered: ");
		for(int i=0;i<numberPeople;i++) {
			System.out.print("&");
		}System.out.println();
		
		totalToPay=checkAmount+totalTip;
		System.out.println("Total to pay: "+totalToPay);
		System.out.println("Total tip: "+totalTip);
		System.out.println("Total per person: "+(totalToPay/numberPeople));
		System.out.println("Tip per person: "+(totalTip/numberPeople));
	}
}
