package assignments.day_5;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		
		//Write a program to calculate the sum of the numbers from 1 till upper bound.
		//You should use a while loop. ex: If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Upper bound");
		int upperBound=s.nextInt();
		int i=1,sum=0;

		while(i<=upperBound) {
			
			sum+=i;
			i++;
			 
		}System.out.print("Sum: "+sum);
		
		 
		
	}

}
