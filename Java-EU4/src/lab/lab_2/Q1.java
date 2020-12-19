package lab.lab_2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.print("Enter your first number: ");
		int firstNumber=s.nextInt();
		System.out.print("Enter your next number: ");
		int next1=s.nextInt();
		int big,small;
		if(firstNumber<next1) {
			big=next1; 
			small=firstNumber;
		}else 
			{big=firstNumber;
			small=next1;}

		int yesNo;
		do {
			System.out.print("Do you want to enter another number: 0-No, 1-Yes");
			yesNo=s.nextInt();
			if(yesNo==1) {
				System.out.print("Enter your next number: ");
				int next=s.nextInt();
				if(next<small) {
					small=next;
				}else if(next>big) {
					big=next;
				}
				yesNo++; 
		}
			}while(yesNo>0);
		System.out.println(("Smallest number is: "+small+"\nLargest number is: "+big));

	}

}













