package day26_arrays_part3;

import java.util.Scanner;

public class Task_Rainfall {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String [] months= {"Jan:", "Feb:","March:","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
		
		for(String value: months) {
			double inch=sc.nextDouble();
			value+=inch;
			System.out.println(value);
		}
	
	}
	
}
