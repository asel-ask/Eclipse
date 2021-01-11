package a_reviiew.Week17;

public class TryCatchEx {

	public static void main(String[] args) {
		
		String s="java";
		
		try {
			System.out.println(s.charAt(1));
			throw new RuntimeException();
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println(s.charAt(0));
		}catch(RuntimeException e) {
			System.out.println("Exception");
		}
		
		
	}
}
