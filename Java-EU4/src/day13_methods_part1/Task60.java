package day13_methods_part1;

public class Task60 {
	public static void main(String[] args) {
		
		parameters(6, 3, "+");
		parameters(6, 3, "-");
		parameters(6, 3, "*");
		parameters(6, 3, "/");
		
	}
	
	
	public static void parameters(int num1, int num2, String operator ) {
		
		switch(operator) {
		
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
		}
	}
}
