package lab.lab_3;

public class Q6 {

	public static void main(String[] args) {
		 
		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("Java"));
		System.out.println(withoutEnd("Coding"));

	}
	public static String withoutEnd(String str) {
		
		if(str.length()<2) {
			return "Invalid result";
		}
		
		return str.substring(1, str.length()-1);
	}
}
