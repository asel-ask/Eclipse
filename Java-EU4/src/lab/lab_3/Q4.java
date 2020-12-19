package lab.lab_3;

public class Q4 {

	public static void main(String[] args) {
		 
		System.out.println(firstTwo("Hello"));
		 System.out.println(firstTwo(""));
		 System.out.println(firstTwo("abcdefgh"));
		 System.out.println(firstTwo("a"));
	}
		public static String firstTwo(String str) {
			if(str.length()>0 && str.length()<2) {
				return str;
			}else if(str.isEmpty()) {
				return "";
			}else {
				return str.substring(0,2);
			}
			
			
			 
		}
}
