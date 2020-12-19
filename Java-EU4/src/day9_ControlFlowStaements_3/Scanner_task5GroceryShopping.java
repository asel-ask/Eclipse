package day9_ControlFlowStaements_3;
import java.util.Scanner;

public class Scanner_task5GroceryShopping {

	public static void main(String[] args) {


		Scanner scan = new Scanner (System.in);
		
		
		double priceT=scan.nextDouble();
		double quantityT=scan.nextDouble();
		double totalT=priceT*quantityT;
		
		double priceP=scan.nextDouble();
		double quantityP=scan.nextDouble();
		double totalP=priceP*quantityP;
		
		double priceB=scan.nextDouble();
		double quantityB =scan.nextDouble();
		double totalB=priceB*quantityB;
		
		double grandTotal=totalB+totalP+totalT;
		
		System.out.println("You got "+quantityT+" tomatoes price is "+priceT+" and total : "+totalT);
		System.out.println("You got "+quantityP+" potatoes price is "+priceP+" and total : "+totalP);
		System.out.println("You got "+quantityB+" bananas price is "+priceB+" and total : "+totalB);
		System.out.println("Your grand total is: "+grandTotal);
	}

}
