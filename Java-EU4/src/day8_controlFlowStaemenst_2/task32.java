package day8_controlFlowStaemenst_2;

public class task32 {

	public static void main(String[] args) {
		
		//Declare 3 numbers. Program should display which one is largest

		int n1=100;
		int n2=200;
		int n3=1200;
		
		if((n1>n2)&&(n1>n3)) {
			System.out.println("N 1 is greatest one");
		}else if((n2>n1)&&(n2>n3)) {
			System.out.println("N 2 is greatest one");
		}else if((n3>n1)&&(n3>n2)) {
			System.out.println("N 3 is greatest one");
		}else {
			System.out.println("Numbers are equal");
		}
		
	}

}
