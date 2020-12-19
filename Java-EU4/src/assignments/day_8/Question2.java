package assignments.day_8;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		 
		 cube();
	}
	
	public static void cube() {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter an integer");
		int num=s.nextInt();
		int result=num*num*num;
		
		System.out.println(result);
	}
}
