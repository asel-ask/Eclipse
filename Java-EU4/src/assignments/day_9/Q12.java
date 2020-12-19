package assignments.day_9;

public class Q12 {

	public static void main(String[] args) {
		
		String withX="xHI";
		
		if(withX.substring(0,1).equalsIgnoreCase("x") && withX.substring(withX.length()-1).equalsIgnoreCase("x")) {
			System.out.println(withX.substring(1,withX.length()-1));
		}else if(withX.substring(0,1).equalsIgnoreCase("x")) {
			System.out.println(withX.substring(1));
		}else if(withX.substring(withX.length()-1).equalsIgnoreCase("x")) {
			System.out.println(withX.substring(0,withX.length()-1));
		}else 
			System.out.println(withX);
		
		
	}
}
