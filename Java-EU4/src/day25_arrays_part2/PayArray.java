package day25_arrays_part2;

import java.util.Scanner;

public class PayArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int [] hours=new int[5];
		double  wage;
		double[] grossPay=new double[5];
		
		System.out.println("Enter hours for employee ");
		for(int i=0;i<hours.length;i++) {
				hours[i]=sc.nextInt();
		}
		System.out.println("Enter hourly wage");
		wage=sc.nextDouble();
		for(int i=0;i<grossPay.length;i++) {
			
			System.out.println("Gross pay for employee #"+(i+1)+" "+(hours[i]*wage));
		}
		}

}
