package assignments.day_8;

public class Question9 {
	public static void main(String [] args) {
		
		int y=max(2, 25);
		System.out.println(y);
	}
	
	public static int max(int x, int max) {
		
		if(x>max) {
			return max;
		}else 
			return x;
	}
}
