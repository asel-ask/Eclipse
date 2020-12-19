package lab.lab_2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
		/*Write a program that will ask the user to enter the amount of a purchase.
		 *  The program should then compute the state and county tax sales tax. 
		 *  Assume the state sales tax is 4 percent and the county sales tax is 2 percent. 
		 *  The program should display the amount of the purchase , the state sales tax, 
		 *  the county sales tax, the total sales tax, and the total of the sale 
		 *  (which is the sum of the amount of purchase plus the total sales tax)
		 */

		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the amount of a purchase");
		double amount=s.nextDouble();
		double stateSalesTax=amount*0.04;
		double countrySalesTax=amount*0.02;
		System.out.println("Amount of purchase: "+amount);
		System.out.println("State sales tax: "+stateSalesTax);
		System.out.println("Country sales tax: "+countrySalesTax);
		System.out.println("Total sales tax: "+(stateSalesTax+countrySalesTax));
		System.out.println("Total of sale: "+(amount+stateSalesTax+countrySalesTax));

	}

}
