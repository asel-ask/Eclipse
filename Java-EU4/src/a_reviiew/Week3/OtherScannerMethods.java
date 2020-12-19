package a_reviiew.Week3;

import java.util.Scanner;

public class OtherScannerMethods {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Full name");
		String fullName=scan.nextLine();
		System.out.println("Enter number within the range of byte");
		byte   num1 = scan.nextByte();
		System.out.println("Enter number within the range of short");
		short  num2 = scan.nextShort();
		System.out.println("Enter number within the range of int");
		int    num3 = scan.nextInt();
		System.out.println("Enter number within the range of long");
		long   num4 = scan.nextLong();
		System.out.println("Enter number within the range of float");
		float  num5 = scan.nextFloat();
		System.out.println("Enter number within the range of double");
		double num6 = scan.nextDouble();
		System.out.println("Enter true or false");
		boolean num7 = scan.nextBoolean();
		System.out.println("Enter your first name");
		
		String name=scan.next();

	}

}
