package lab.lab_3;

public class Q9 {

	public static void main(String[] args) {

		System.out.println(right2("Hello"));
		System.out.println(right2("java"));
		System.out.println(right2("Hi"));

	}
	public static String right2(String str) {
		if(str.length()<2) {
			return "Invalid result";
		}
		
		String end =str.substring(str.length()-2);
		String s=str.substring(0, str.length()-2);
		return end.concat(s);
	}
}
