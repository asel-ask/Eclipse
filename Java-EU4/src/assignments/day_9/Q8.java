package assignments.day_9;

public class Q8 {

	public static void main(String[] args) {
		
		String email="subject: important project, Alejandro we refer to you this ...";
		//String email="thunder blaz is the best drink in the galaxy...";
		//String email="dear alejandro.....alot of text";
		
		email=email.toLowerCase();
		
			
			if(email.contains("alejandro")) {
				System.out.println("read this mail");
			}else {
				System.out.println("don't read this mail");
			}
			
		
	}
}
