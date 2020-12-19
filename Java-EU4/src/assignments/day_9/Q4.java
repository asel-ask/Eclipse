package assignments.day_9;

public class Q4 {

	public static void main(String[] args) {

		String str="whatsup ";
		
		if(str.length()%2!=0) {
			if(str.length()>=5) {
				
				System.out.println(str.substring(str.length()/2-1,str.length()/2+2));
				
				
			}else 
				System.out.println("invalid");
			
			
		}else 
			System.out.println("Invalid");

	}

}
