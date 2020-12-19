package day7_controlFlowStatements;

public class ifElseStatement {

	public static void main(String[] args) {
		
		int score=60;
		
		if(score>=70) { 
			
			System.out.println("Excelent");
			System.out.println("You passed with grade A");
		}else {
			
			System.out.println("You are failed");
		}
		int sales,bonus;
		double commision,salary;
		
		sales=5200;
		salary=10000;
		if(sales>5000) {
			bonus=500;
			commision=1.12;
			salary=salary*commision+bonus;
			
		}else {
			bonus=100;
			commision=1.10;
			
			
		}
		
		salary=salary*commision+bonus;
		System.out.println("Salary = "+salary);
			

	} 
		
		
		
		

}
