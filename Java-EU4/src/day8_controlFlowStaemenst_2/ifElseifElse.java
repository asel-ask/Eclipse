package day8_controlFlowStaemenst_2;

public class ifElseifElse {

	public static void main(String[] args) {
		
		//Program to display days
		//1-Monday
		//2-Tuesday
		//3-Wednesday
		//4-Thursday
		//5-Friday
		//6-Saturday
		//7-Sunday
		
		int day=5;
		
		if(day==1) {
			System.out.println("Today is Monday");
			
		}else if(day==2) {
			System.out.println("Today is Tuesday");
		}else if (day==3) {
			System.out.println("Today is Wednesday");
		}else if (day==4) {
			System.out.println("Today is Thursday");
		}else if (day==5) {
			System.out.println("Today is Friday");
		}else if (day==6) {
			System.out.println("Today is Saturday");
		}else if (day==7) {
			System.out.println("Today is Sunday");
		}else {
			System.out.println("Not a valid day");
		}
		System.out.println("********************************");
		
		int age=16;
		
		if(age<=2||age>18) {
			System.out.println("ineligible");
		}else if(age==2) {
			System.out.println("toddler");
		}else if(age>=3&&age<=5) {
			System.out.println("early childhood");
		}else if(age==6||age==7) {
			System.out.println("young reader");
		}else if(age>=8&age<=10) {
			System.out.println("elemetary");
		}else if(age==11||age==12) {
			System.out.println("middle");
		}else if (age==13) {
			System.out.println("imposible");
		}else if(age>=14&&age<=16) {
			System.out.println("high school");
		}else if(age==17||age==18) {
			System.out.println("scholar");
		}else 
			System.out.println("Not valid age");
		System.out.println("i will learn \"java\" \n and \"Selenium\"");
		
		
	}
	
	

}
