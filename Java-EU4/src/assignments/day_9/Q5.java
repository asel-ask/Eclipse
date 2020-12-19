package assignments.day_9;

public class Q5 {

	public static void main(String[] args) {
		 
		String s1="ear";
		String s2="pie";
		int num1=s1.length();
		int num2=s2.length();
		
		
		if(num1!=num2) {
			System.out.println("can not merge");
			
		}else {
			
			for(int i=0;i<3;i++) {
				System.out.print(s1.charAt(i)+""+s2.charAt(i));
			}
			
			
		}

	}

}
