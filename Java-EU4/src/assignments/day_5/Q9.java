package assignments.day_5;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter end number: ");
		int end=sc.nextInt();
		int i=1;
		String a="";
		
		
		while(i<end) {
			 
			if(i%2!=0) {
				 
				System.out.print(a+i);
				a=",";
				  }   
					  i++;
		  
		} 
		
		
	}
}
	

	 
