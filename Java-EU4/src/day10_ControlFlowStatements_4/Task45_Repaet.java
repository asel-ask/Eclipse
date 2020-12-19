package day10_ControlFlowStatements_4;

public class Task45_Repaet {

	public static void main(String[] args) {
		
//		User should be able to declare 2 values and program should display which number is
//		largest.
//		if numbers are equal, it should display numbers are equal
//		Above steps need to repeated to number of times that is also declared by user.
	
		int num1=50,num2=10,reapet=5;
		
		for(int i=1;i<=reapet;i++) {
			
			if(num1>num2) {
				System.out.println("Number1 is greater than Num2");
			}else if (num2>num1) {
				System.out.println("Number2 is greater than Num1");
			}else if(num1==num2) {
				System.out.println("Number1 is equal to Num2");
			}
			
			
		}


	}

}
