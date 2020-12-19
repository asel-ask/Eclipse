package lab.lab_3;

public class Q5 {

	public static void main(String[] args) {

		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));

	}
	public static String firstHalf(String str) {
		
		if(str.length()%2==0) {
			return str.substring(0, str.length()/2);
		}else 
			return "invalid input";
	}
}
