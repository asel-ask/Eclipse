package day23_randomClass;

import java.util.*;

public class Task83_RandomNumbers {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		int num1,num2;
		String ans="y";
		
		
		do {
			System.out.println("rolling the dise...");
		    num1=rn.nextInt(6)+1;
			num2=rn.nextInt(6)+1;
			System.out.println("Their values are: "+num1+" "+num2);
			System.out.print("Roll them again (y=yes)?");
			ans=sc.next();
			
		}while(ans.equalsIgnoreCase("y"));

	}

}
