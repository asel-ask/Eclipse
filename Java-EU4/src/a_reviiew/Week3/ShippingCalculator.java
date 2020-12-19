package a_reviiew.Week3;

import java.util.Scanner;

public class ShippingCalculator {

	public static void main(String[] args) {
		
		// Create a program to calculate shipping for amazon shopping
		//ask user if they are prime member or not /except yes or no answer
		//if yes--> shipping is free
		//if no--> 
				// ask user what the amount for your shopping as double 
				//if the number is more than 35---> free shipping
				//print your total is same number as user entered
				//if the number is less than 35 ---> the add 5 dollar shipping
		
		//print your total is 5 dollar more than your number
		
		
		
		String primeMember;
		double price;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Are you Prime member ? Say yes or no ");
		primeMember=scan.next();
		
		System.out.println("What is the amount of your shopping ?");
		price=scan.nextDouble();
		
		if (primeMember.equals("yes")) {
			
		System.out.println("Hello dear member!! Free shipping"+price);
		}else if (primeMember.equals("No")) {
			if(price>35) {
				System.out.println("Lots of shopping!! Free shipping");
			}else {
				System.out.println("Your total is "+(price+5));
				System.out.println("Consider signing up for Prime to save shipping fee!!!");	
			}
		}else {
			System.out.println("System Crush, you can only say yes or no");
		}
		
		
		
		
	}

}
