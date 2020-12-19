package day10_ControlFlowStatements_4;

public class Task42_summOfOddsnEven {

	public static void main(String[] args) {
		
//		Write a program that displays sum of even and odd numbers between 1 and 100
//		excluding 100
		
		int sumEven=0;
		int sumOdd=0;

		for(int i=1; i<100; i++) {
			
			if(i%2==0) {
				sumEven=sumEven+i;
					
			}else {
				sumOdd=sumOdd+i;
			}  
		}
		
		System.out.println("Summ of odd numbers = "+sumOdd);
		System.out.println("Summ of even numbers = "+sumEven);
	}

}
