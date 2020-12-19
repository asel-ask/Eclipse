package QuizPractice;

import java.util.Scanner;

public class CarpetTest {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to carpet cost calculator");
		System.out.println("------------------");
		System.out.print("Enter length of your flat: ");
		double length=sc.nextDouble();
		System.out.print("Enter width of your flat: ");
		double width=sc.nextDouble();
		System.out.print("Enter cost of carpet: ");
		double cost=sc.nextDouble();
		
		
		
		
		Floor f=new Floor(length, width);
		Carpet c=new Carpet(cost);
		Calculator calc=new Calculator(f, c);
		
		System.out.println("To cover the floor "+f.getArea()+ "with a carpet that costs $"
				+ c.getCost()+" per square meter would cost $"+calc.getTotalCost());
		

	}

}
