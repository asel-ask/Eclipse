package lab.lab_3;

public class Q10 {

	public static void main(String[] args) {
		 
		System.out.println(frontAgain("Edited"));
		System.out.println(frontAgain("edit"));
		System.out.println(frontAgain("ed"));
		System.out.println(frontAgain("kabaka"));
		
	}
	public static boolean frontAgain(String str) {
		String s1=str.substring(0,2);
		String s2=str.substring(str.length()-2);
		return s1.equalsIgnoreCase(s2); 
			
}
}