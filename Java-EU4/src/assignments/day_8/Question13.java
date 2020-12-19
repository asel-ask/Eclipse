package assignments.day_8;

public class Question13 {

	public static void main(String[] args) {

		double d=waterTax(65);
		System.out.println(d);
		System.out.println(waterTax(112.0));
		System.out.println(waterTax(177));
	}
	
	public static double waterTax(double waste) {
		double bill = 0;
		if(waste<=50) {
			bill=waste*0.60;
		}else if(waste>50) {
			bill=waste*0.90;
			if(waste>100 && waste<150) {
			bill+=50;
		   }else if(waste>150) {
			   bill+=100;
		   }
		   }
		return bill;
	}
}
