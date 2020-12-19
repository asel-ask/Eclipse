package assignments.day_9;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start point:");
		char startPoint=sc.next().charAt(0);
		System.out.println("Enter end point");
		char endPoint=sc.next().charAt(0);
		
		if(startPoint==endPoint) {
			System.out.println(startPoint+" found");
		}
		if(startPoint=='A' && endPoint=='B') {
			System.out.println("right: "+endPoint+" found");
		}else if(startPoint=='A' && endPoint=='C') {
			System.out.println("right > down: "+endPoint+" found");
		}else if(startPoint=='A' && endPoint=='D') {
			System.out.println("right > down > left: "+endPoint+" found");
		}else if(startPoint=='B' && endPoint=='C') {
			System.out.println("down: "+endPoint+" found");
		}else if(startPoint=='B' && endPoint=='D') {
			System.out.println("down > left: "+endPoint+" found");
		}else if(startPoint=='B' && endPoint=='A') {
			System.out.println("down > left > up: "+endPoint+" found");
		}else if(startPoint=='C' && endPoint=='D') {
			System.out.println("left: "+endPoint+" found");
		}else if(startPoint=='C' && endPoint=='A') {
			System.out.println("left > up: "+endPoint+" found");
		}else if(startPoint=='C' && endPoint=='B') {
			System.out.println("left > up > right: "+endPoint+" found");
		}else if(startPoint=='D' && endPoint=='A') {
			System.out.println("up: "+endPoint+" found");
		}else if(startPoint=='D' && endPoint=='B') {
			System.out.println("up > right: "+endPoint+" found");
		}else if(startPoint=='D' && endPoint=='C') {
			System.out.println("up > right > down: "+endPoint+" found");
		}
	}
}
