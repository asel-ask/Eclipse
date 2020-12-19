package day23_randomClass;

import java.util.Random;
import java.util.Scanner;

public class Task85 {

	public static void main(String[] args) {
		 
		Random rn=new Random();
		Scanner sc=new Scanner(System.in);
		int comp,userIn;
		int compCount = 0,userCount = 0;
		for(int i=0;i<10;i++) {
			comp=rn.nextInt(6)+1;
			System.out.println("Enter 10 times number between 1 to 6");
			userIn=sc.nextInt();
			if(comp>userIn) {
				compCount+=1;
			}else {
				userCount+=1;
			}
		}
		if(compCount==userCount) {
			System.out.println("There is no winner");
		}else if(compCount>userCount) {
			System.out.println("Computer is winner");
		}else 
			System.out.println("User is winner");
	}

}
