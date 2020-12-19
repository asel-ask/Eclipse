package lab.lab_3;

public class Q13 {

	public static void main(String[] args) {
		
		System.out.println(doubleChar("The"));
		System.out.println(doubleChar("AAbb"));
		System.out.println(doubleChar("Hi-There"));
		
	}
	public static String doubleChar(String str) {
			String c = "";
		for(int i=0;i<str.length();i++) {
			c=c+str.substring(i,i+1).concat(str.substring(i,i+1));
			 
		}return c;
		 
		
	}
}
