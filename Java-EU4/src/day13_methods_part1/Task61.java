package day13_methods_part1;

public class Task61 {

	public static void main(String[] args) {
		
		ageCalculator(2020, 1999);
		
	}
	public static void ageCalculator(int year,int birthYear) {
		int age =year-birthYear;
		System.out.println(age);
	}
}
