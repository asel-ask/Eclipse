package day4_arithmeticOperators;

public class contribution {

	public static void main(String[] args) {
		
		/*This program calculates the amount of pay that will be contributed 
		 to a retirement plan if 5%, 8%, or 10% of monthly pay is withheld */
		
		//Variable to hold the monthly pay and the amount of the contribution
		
		double monthlyPay=5000;
		double contribution;
		contribution=monthlyPay*0.05;
		System.out.println("Contribution 5%="+contribution);
		
		
		contribution=monthlyPay*0.08;
		
		System.out.println("Contribution 8%="+contribution);
		
		contribution=monthlyPay*0.10;
		

		System.out.println("Contribution 10%="+contribution);
		
		System.out.println(6-3*2+7-1);


		
	}

}
