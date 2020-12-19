package assignments.day_5;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		//Write a while loop that lets the user enter a number. The number should be multiplied by 10,
		//and the result stored in the variable product. 
		//The loop should iterate as long as product contains a value less than 100.


		 
		Scanner sc=new Scanner(System.in);
		 
		int product=0;
		 
		while(product<100) {
			System.out.println("Enter Num: ");
			int num=sc.nextInt();
			product=num*10;
			System.out.println(product);	 } 
				 System.out.println("The end");
			 
		}
		 



	}


