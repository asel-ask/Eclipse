package assignments.day_3;

public class Question7 {

	public static void main(String[] args) {
		
		int price,exchange,quarters, dimes, nickles;
												        /*quarters=25cent
												         * dimes=10cent
												         * nickels=5cent */
		price=55;
		exchange=100-price;
		quarters=exchange/25;
		dimes=exchange%25/10;
		nickles=exchange%10/5;
		
		
		System.out.println("Price in cents : "+ price);
		System.out.println("Your change    : "+ quarters +" quarters "+ dimes+" dimes "+ nickles +" nickles");


		


		
		
		

	}

}
