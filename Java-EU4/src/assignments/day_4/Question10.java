package assignments.day_4;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number of calories and fat grams in a food");
		double calory=s.nextDouble();
		double fatGrams=s.nextDouble();
		double caloriesFromFat=fatGrams*9;
		double totalCalories=caloriesFromFat+calory;
		double percentage=caloriesFromFat/totalCalories;
		
		 
		if(caloriesFromFat<totalCalories) {
			if(percentage<0.3) {
				System.out.println("indicating the food is low in fat.");
			}
			
			
		}else 
			System.out.println("Input is invalid");
		

	}

}
