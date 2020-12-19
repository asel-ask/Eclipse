package day7_controlFlowStatements;

public class task31 {

	public static void main(String[] args) {
		
		//A triangle is valid if the sum of all the three angles is equal to 180 degrees. 
		//Write a program that declares three integers as angles and check whether a triangle is valid or not.
		
		int ang1=50, ang2=55, ang3=40;
		int sum=ang1+ang2+ang3;
		if (sum==180) {
			System.out.println("Valid triangle");
		} else {
			System.out.println("Invalid triangle");
		}

	}

}
