package day7_controlFlowStatements;

public class ifStatements {

	public static void main(String[] args) {
		
		int score=80;
		
		if(score>=70) { //if its false it wont print anything in cosole
						//it its true it will print ur msg
			
			System.out.println("Excelent");
			System.out.println("You passed with grade A");
			
		}
		
		System.out.println("*****************");
		
		int sales,bonus;
		double commision,salary;
		
		sales=5200;
		salary=10000;
		if(sales>5000) {
			bonus=500;
			commision=1.12;
			salary=salary*commision+bonus;
			
		}
		
		System.out.println("Salary = "+salary);
		
		
		
		
		
		
		
		
		

	}

}
