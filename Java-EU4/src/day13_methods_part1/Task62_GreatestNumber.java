package day13_methods_part1;

public class Task62_GreatestNumber {

	public static void main(String[] args) {

		greatestNumber(500, 100, 15);

	}
	public static void greatestNumber(int num1,int num2,int num3) {
		
		if (num1>num2 && num1>num3) {
			System.out.println("num1 is greatest");
		}else if (num2>num1 && num2>num3) {
			System.out.println("num2 is greatest");
		}else {
			System.out.println("num3 is greatest");
		}
	}
}
