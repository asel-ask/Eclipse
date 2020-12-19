package lab.lab_1;



public class Q6 {

	public static void main(String[] args) {
		
		cigarParty(30, false);
		cigarParty(50, false);
		cigarParty(70, true);
	}
	public static void cigarParty(int num, boolean isWeekend) {
		if(!isWeekend) {
			if(num>=40 && num<=60) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else {
			if(num>=40) {
			System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
	}
}
