package lab.lab_2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		/*A bag of cookies holds 40 cookies. The calorie information on the bag 
		 * claims that there are 10 serving in the bag and that a serving equals 300 calories.
		 *  write a program that lets the user enter the number of cookies he or she actually ate
		 *   and then reports the number of total calories consumed.
		 */

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of cookies you ate:");
		int numOfCookies=sc.nextInt();
		int bagOfCookies=40;
		double caloryPerCookie=30;
		double caloryTotal=numOfCookies*caloryPerCookie;
		 
		
		if(numOfCookies<=40) {
			System.out.println("Total calories: "+caloryTotal);
		}else 
			System.out.println("There is only 40 cookies");
		
	}

}
