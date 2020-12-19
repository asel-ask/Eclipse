package lab.lab_3;

public class Q7 {

	public static void main(String[] args) {
		 
		System.out.println(comboString("hi", "Hello"));
		System.out.println(comboString("Hello", "hi"));
		System.out.println(comboString("aaa", "b"));
		
	}
	public static String comboString(String a, String b) {
		
		if(a.length()>b.length()) {
			return b.concat(a).concat(b);
		}else 
			return a.concat(b).concat(a);
	}
}
