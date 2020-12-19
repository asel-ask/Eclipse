package lab.lab_3;

public class Q2 {

	public static void main(String[] args) {
		 
		System.out.println(makeAbba("Hello","Bye"));
		System.out.println(makeAbba("Yo","Alice"));

	}
	public static String makeAbba(String s1, String s2) {
		
		return s1+s2+s2+s1;
	}
}
