package a_reviiew.Week5;

public class Recursion {

	public static void main(String[] args) {

		printNumber(10);

	}
	
	public static void printNumber(int n) {
		if(n==0) {
			System.out.println("The end");
			return;
		}
		
		System.out.print(n+" ");
		printNumber(n-1);
	}

}
