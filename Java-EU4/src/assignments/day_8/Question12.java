package assignments.day_8;

public class Question12 {

	public static void main(String[] args) {
		 
		boolean b=hamletQuote(false, true);
		System.out.println(b);
		
	}
		
	public static boolean hamletQuote(boolean b1, boolean b2) {
		
		if(b1 && b2 || !b1 && b2 || b1 && !b2) {
			return true;
		}else 
			return false;
		
	}
}
