package lab.lab_2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		/*Write a program that computes the tax and tip on a restaurant bill. 
		 * The program should ask the user to enter the charge for the meal.
		 *  The tax should be 6.75 percent of the meal charge. 
		 *  The tip should be 20 percent of the total after adding tax.
		 *   Display the meal charge, tax amount, tip amount, and total bill on the screen.
		 */

		Scanner s=new Scanner(System.in);
		System.out.println("Please enter amount of the meal");
		double amount=s.nextDouble();
		double tax=(amount*6.75)/100;
		double tip=(amount+tax)*20/100;
		double total=amount+tax+tip;
		System.out.println("The meal charge: "+amount+"\nTax amount: "+tax+"\nTip amount:"+tip+"\nTotal bill: "+total);
		
		
	}

}
