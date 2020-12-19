package assignments.day_8;

public class Question4 {

	public static void main(String[] args) {

		printHollowRect();
	}
	
	public static void printHollowRect () {
		
		
		for(int k=1;k<=5;k++) {
			System.out.print("*");
		}System.out.println();
		for(int i=3; i>0; i--) {
			for(int j=1; j<2; j++) {
				System.out.print("*   *");
			}System.out.println();
		}for(int k=1;k<=5;k++) {
			System.out.print("*");
		}System.out.println();
		
	}
}
