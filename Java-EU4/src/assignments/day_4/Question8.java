package assignments.day_4;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		 
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of package:");
		int quantityOfPackage=s.nextInt();
		double packageCost=99;
		double total=quantityOfPackage*packageCost;
		 
		if(quantityOfPackage>=10 && quantityOfPackage<20) {
			total-=total*0.20;
		}else if(quantityOfPackage>=20 && quantityOfPackage<50) {
			total-=total*0.30;	
		}else if(quantityOfPackage>=50 && quantityOfPackage<100) {
			total-=total*0.40;	
		}else if(quantityOfPackage>=100) {
			total-=total*0.50;	
		}else 
			total=quantityOfPackage*packageCost;
	
		
		
		System.out.println("Total payment - $"+total);
	}

}
