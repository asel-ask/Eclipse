package assignments.day_8;

public class Question10 {

	public static void main(String[] args) {

		boolean x=isEven(46);
		System.out.println(x);

	}

	public static boolean isEven(int num) {
		
		if(num%2==0) {
			return true;
		}else  
			return false;
			 
	}
}
