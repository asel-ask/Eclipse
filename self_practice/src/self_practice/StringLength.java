package self_practice;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {

		String str="Java";
		System.out.println(str.length());
		int x=str.length();
		System.out.println(x*4);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=s.nextLine();
		System.out.println("Total character in your name:"+name.length());
	}

}
