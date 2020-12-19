package assignments.day_4;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your income: ");
		long income=sc.nextLong();
		double tax;
		if(income<=150_000_000){
			tax=income*0.25;
		}else if(income<=300_000_000) {
			tax=(150_000_000*0.25)+(income%150_000_000)*0.30;
		}else if(income<=600_000_000){
			tax=income*0.35;
		}else if(income<=1_200_000_000){
			tax=income*0.40;
		}else 
			tax=income*0.50;
		
		System.out.println("Your income : "+income+"\nThe tax amount you have to pay :"+(long)tax);

	}



}
