package lab.lab_3;

public class Q16 {

	public static void main(String[] args) {
		
		 System.out.println(atFisrt("h"));
	}
	public static String atFisrt(String str) {
		if(str.length()>1) {
			return str.substring(0,2);
		}else 
			return str.substring(0).concat("@");
	}
}
