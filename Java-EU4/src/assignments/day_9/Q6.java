package assignments.day_9;

public class Q6 {

	public static void main(String[] args) {
		
		String str="apple";
		
		if(str.length()<5) {
			System.out.println("Too short!");
		}else if(str.length()>5) {
			System.out.println("Too long!");
		}else {
			String dummy="";
			for(int i=str.length()-1;i>=0;i--) {
				dummy+=str.charAt(i)+"";
			}
			System.out.println(dummy);
		}
		
		
		
		
	}
}
