package day13_methods_part1;

public class Task59_hourlyPayment {

	public static void main(String[] args) {
		
		 
		showPay(5.3, 25);
		showPay(37, 52.5);

	}
	
	public static void showPay(double hour, double hourlyPay) {
		
		System.out.println("Payment is "+(hour*hourlyPay));
	}

}
