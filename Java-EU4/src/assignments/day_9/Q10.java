package assignments.day_9;

public class Q10 {

	public static void main(String[] args) {
		
		String email="craig_federighi@apple.com";
		
		String fName=email.substring(0,1).toUpperCase().concat(email.substring(1,email.indexOf("_")));
		String lName=email.substring(email.indexOf("_")+1,email.indexOf("_")+2).toUpperCase().concat(email.substring(email.indexOf("_")+2,email.indexOf("@")));
		
		
		
		System.out.println("First name: "+fName);
		System.out.println("Last name: "+lName);
		System.out.println("Domain: "+email.substring(email.indexOf("@")+1,email.indexOf(".")));
		System.out.println("Top-Level Domain: "+email.substring(email.indexOf(".")+1));
		
		
	}
}
