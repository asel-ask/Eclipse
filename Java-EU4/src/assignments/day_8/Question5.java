package assignments.day_8;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		sign(n);
	}
	
	public static void sign(int num) {
		if(num>0) {
			System.out.println(1);
		}else if(num<0) {
			System.out.println(-1);
		}else 
			System.out.println(0);
	}
}
