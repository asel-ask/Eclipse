package day8_controlFlowStaemenst_2;

public class task36_Calculator {

	public static void main(String[] args) {
		
		int n1=10;
		int n2=5;
		String operator="*";
		int result=0;
		
		switch (operator) {
		
		case "+":
			result=n1+n2;
			break;
		case "-":
			result=n1-n2;
			break;
		case "*":
			result=n1*n2;
			break;
		case "/":
			result=n1/n2;
			break;
		default:
			System.out.println("invalid Operetor");
		
	} System.out.println("Result is "+result);
		


	}

}
