package day4_arithmeticOperators;

public class discount {

	public static void main(String[] args) {
		//This program will calculate the sale of an
		//item that regulary priced at $59, with 20% discount 
		
		
		int regularPrice=59;
		double discount;
		double salesPrice;
		
		
		discount= regularPrice*0.2;
		salesPrice= regularPrice-discount;
		
		System.out.println("Regular Price $"+regularPrice); 
		System.out.println("Discount Amount $"+discount);
		System.out.println("Sales Price $"+salesPrice);
		
		
		
		
		
	}

}
