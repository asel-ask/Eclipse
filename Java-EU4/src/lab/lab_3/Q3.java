package lab.lab_3;

public class Q3 {

	public static void main(String[] args) {
		 
		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("I am Java"));
		System.out.println(extraEnd("k"));
	}
	public static String extraEnd(String str) {
		if(str.length()<2) {
		return "Invalid result";
		} 
		String dummy="";
		dummy=str.substring(str.length()-2);
		return dummy+dummy+dummy;
	}
}
