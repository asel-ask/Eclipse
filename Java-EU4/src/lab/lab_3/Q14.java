package lab.lab_3;

public class Q14 {

	public static void main(String[] args) {

		System.out.println(endsLy("oddly"));
		System.out.println(endsLy("y"));
		System.out.println(endsLy("oddy"));

	}
	public static boolean endsLy(String str) {
		
		if(str.endsWith("ly")) {
			return true;
		}else 
			return false;
	}
}
