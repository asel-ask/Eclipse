package day7_controlFlowStatements;

public class task28_revenue {

	public static void main(String[] args) {
		
		double price=20;
		int quantity=400;
		double revenue=price*quantity;
		double discount=0;
		
		if(revenue>5000) {
			discount=revenue*0.1;
			revenue=revenue-discount;
			
		}
		System.out.println("discount = "+discount);
		System.out.println("revenue = "+revenue);
	}

}
