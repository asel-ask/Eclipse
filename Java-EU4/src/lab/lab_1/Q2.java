package lab.lab_1;

public class Q2 {

	public static void main(String[] args) {

		love6(2, 4);

	}
	public static void love6(int num1,int num2) {
		
		if(num1+num2==6 || num1==6  || num2==6 || num1-num2==6 || num2-num1==6) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
