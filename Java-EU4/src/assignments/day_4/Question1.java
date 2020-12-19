package assignments.day_4;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter your weight in pounds: ");
		double pounds=s.nextDouble();
		System.out.println("Enter your height in feet and inches: ");
		int feet=s.nextInt();
		int inches=s.nextInt();
		double kg=pounds/2.2;
		double meters=(feet*12)*0.0254+(inches*0.0254);
		double bmi=kg/(meters*meters);
		
		System.out.println("Your weight in pounds: "+pounds);
		System.out.println("Your height in feet followed by a space then additional inches: "+feet+" "+inches);
		System.out.println("Your BMI is: "+bmi);
		 
		if(bmi<18.5) {
			System.out.println("Your risk factory is Underweight");
		}else if(bmi>=18.5 && bmi<25) {
			System.out.println("Your risk factory is Normal Weight");
		}else if(bmi>=25 && bmi<30) {
			System.out.println("Your risk factory is Overweight");
		}else if (bmi>30) {
			System.out.println("Your risk factory is Obese");
		}
	}

}
