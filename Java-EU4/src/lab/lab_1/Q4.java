package lab.lab_1;

public class Q4 {

	public static void main(String[] args) {
		 
		deerPlay(70, false);
		deerPlay(95, false);
		deerPlay(95, true);
		
	}
	public static void deerPlay(double temp,boolean isSummer) {
		if(isSummer) {
			if(temp>=60 && temp<=100) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else {
			if(temp>=60 && temp<=90) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
		
	}
}
