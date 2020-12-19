package day4_arithmeticOperators;

public class wages {
	//This program will calculate hourly wages plus overtime
	
	
	public static void main(String[] args) {
		
		double regularWages; //The calculated regular wage  
		double basePay=25;  //The Base Pay
		double regularHour=40; //The hours worked less overtime
		double overTimeWages;  //Overtime Wages
		double overTimePay=37.50; //Overtime Pay Rate
		double overTimeHour=10; //The overtime hours 
		double totalWage; //Total Wage
		
		regularWages=basePay*regularHour;
		overTimeWages=overTimePay*overTimeHour;
		totalWage=regularWages+overTimeWages;
		
		
		System.out.println("Wages for this week are $ "+totalWage);
		
		
		

	}

}
