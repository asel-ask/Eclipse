package day10_ControlFlowStatements_4;

public class Task40_allEvenNumbers {

	public static void main(String[] args) {
		
		//Write a program that displays all even numbers between 1-100 in same line


		for (int num=1; num<=100; num++) {
			
			if (num%2==0) {
			System.out.print(num+",");
			
			}
		}
		
	}

}
