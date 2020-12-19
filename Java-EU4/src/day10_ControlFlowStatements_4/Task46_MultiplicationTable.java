
package day10_ControlFlowStatements_4;

public class Task46_MultiplicationTable {

	public static void main(String[] args) {
		
//		Write a program that the user to declare a positive integer. It should then print the
//		multiplication table of that number.
		
		int num=6;
		
		System.out.println("Multiplication Table for "+num);
		System.out.println("******************************");
		
		for(int i=1; i<=10;i++) {
			
			System.out.print(num+"*"+i+"="+(num*i));
			
		}



	}

}
