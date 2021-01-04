package day45_exception;

public class OrCatchBlock {
	static String str;
	public static void main(String[] args) {
		
		
		try {
			System.out.println(str.toUpperCase());
			
		}catch(IllegalArgumentException | NullPointerException e) {
			//Exceptions types cannot be sub parent types
			e.printStackTrace();
		}
	}
}
