package assignments.day_5;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		
		/*Write a program to print 
		 * Fibonacci series of n terms
		 *  where n is declared by user :  0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......*/
		 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scan.nextInt();
		int a1=0, a2=1;
		
		
		for(int i=1;i<=n;i++) {
			
		 
			System.out.print(a2+" ");
			int sum=a1+a2;
			a1=a2;
			a2=sum;
		
		}  
		}


	}


