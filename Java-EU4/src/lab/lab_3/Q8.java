package lab.lab_3;

public class Q8 {

	public static void main(String[] args) {
		 
		System.out.println(left2("Hello"));
		System.out.println(left2("java"));
		System.out.println(left2("hi"));

	}
	public static String left2(String str) {
		if(str.length()<2) {
			return "Invalid result";
		}
		String s=str.substring(0,2);
		String s1=str.substring(2);
		return s1.concat(s);
	}
}
