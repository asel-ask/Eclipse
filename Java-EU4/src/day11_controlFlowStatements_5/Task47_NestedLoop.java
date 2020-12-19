package day11_controlFlowStatements_5;

public class Task47_NestedLoop {

	public static void main(String[] args) {
		
		//Write a Java program to create pattern

		int rows=7;
		int columns=6;
		
		for(int i=1;i<=rows;i++) {
			
			for (int b=1;b<=columns;b++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
