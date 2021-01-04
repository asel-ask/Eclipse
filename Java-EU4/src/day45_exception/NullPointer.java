package day45_exception;

public class NullPointer {

	static String name;
	
	public static void main(String[] args) {
		try {
		System.out.println(name.toUpperCase());
		}catch (ArithmeticException e) {  // (Exception e)
			System.out.println("Null pointer exception happaned");
			System.out.println("Here is the msg: "+ e.getMessage());
			System.out.println("Here is the stack trace: ");
			e.printStackTrace();
		}
	}
}
