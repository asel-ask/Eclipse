package day14_methods_part2;

public class Task68_2methods {

	public static void main(String[] args) {

		yearsUntilRetirement("Mike" ,1995);
		
	}
	
	public static int calculateAge(int yearBirth) {

		return 2019-yearBirth;
		
	} 
	
	public static void yearsUntilRetirement(String name,int year) {
		int retirementYear=65-calculateAge(year);
		System.out.println(name+" retires in "+retirementYear+" years");
		
	}
}
