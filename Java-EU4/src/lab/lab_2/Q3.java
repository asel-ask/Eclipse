package lab.lab_2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive nonzero integer");
		int num=sc.nextInt();
		
		int sum=0;
		if(num>0) {
		for(int i=1;i<num;i++) {
			sum+=i;
		}
		System.out.println("Sum is: "+sum);
		}else
			System.out.println("Invalid parameters");
		
	}

}
