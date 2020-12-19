package assignments.day_8;

public class Question11 {

	public static void main(String[] args) {
		 
		String i=c_profits(500, 650);
		System.out.println(i);
		
	}

	public static String c_profits(int buyPrice, int sellPrice) {
		 
		if(buyPrice<sellPrice) {
			return "profit";
		}else if(buyPrice>sellPrice) {
			return "loss";
		}else 
			return "no loss";
		
	}
}
