package day34_constructorsPassingObjectToMethod;

import java.util.Scanner;

public class CarpetCostTest {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the lenght of the room: ");
		double length=sc.nextDouble();
		System.out.print("Enter the width of the room: ");
		double width=sc.nextDouble();
		System.out.print("Enter the cost per square: ");
		double cost=sc.nextDouble();
		
		
		Floor f1=new Floor(length, width);
		Carpet carp1=new Carpet(cost);
//		Floor floor = f1;
//		Carpet carpet = carp1;
		Calculator cal=new Calculator(f1, carp1);
		
		System.out.println("To cover the floor "+f1.getArea()+" square meters with a carpet that costs $"
				+carp1.getCost()+" per square meter would cost $"+cal.getTotalCost());
		


	}

}
