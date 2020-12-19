package day13_methods_part1;

public class PassMultipleArg {

	public static void main(String[] args) {
		
		showSum(5, 10);
		showSum(60, 1);
		showSum(100, 200);

	}
	
	 public static void showSum(int num1,int num2) {
		 System.out.println("Sum is: "+(num1+num2));
	 }
}
