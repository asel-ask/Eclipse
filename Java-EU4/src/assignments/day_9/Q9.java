package assignments.day_9;

public class Q9 {

	public static void main(String[] args) {
		
		String email="mike_tyson@gmail.com";
		String fName = null,lName = null;
		
		 if(!email.contains("_")){
		     System.out.println(email);
		     
		    }else {
		    	//mike_tyson@gmail.com
		    	String firstName=email.substring(0, email.indexOf("_"));
		    	String lastName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
		    	email=lastName.concat("_").concat(firstName).concat("@gmail.com");
		    	System.out.println(email);
		    	
		    }
		
	}
}
