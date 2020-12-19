package a_reviiew.Week3;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter your weight in killogram");
		double weight=sc.nextDouble();
		double height=sc.nextDouble();
		
		double bmi=weight/(height*height);
		
		System.out.println("Your BMI is "+bmi);
		
		if (bmi<18.5) {
			System.out.println("You are underweight");
		}else if (bmi>=18.5 && bmi<25) {
			System.out.println("You are normal");
		}else if (bmi>=25 && bmi<=30.0) {
			System.out.println("You are overweight");
		}else if (bmi>30) {
			System.out.println("You are obese");
		}
		

	}

}
