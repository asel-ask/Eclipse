package assignments.day_4;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an object's mass");
		int kg=sc.nextInt();
		double weight=kg*9.8;
		
		if(weight>1000) {
			System.out.println("Indicating that it is too heavy");
		}else if(weight>10){
			System.out.println("Indicating that the object is too light");
		}

	}

}
