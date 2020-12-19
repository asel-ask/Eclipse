package a_reviiew.Week3;

public class LoginTest {

	public static void main(String[] args) {


		
		//correct username password is abcd and secret
		
		//if the username and password is abdc and secret at the same time print LOGIN SUCCESSFUL
		//else
		//print LOGIN NOT SUCCESSFUL
		//Optionally add logic for what was not correct
		
		
//		if(username.equals("abcd") && password.equals("secret") ) {
//			System.out.println("LOGIN SUCCESSFUL!!!");
//		}else {
//			System.out.println("LOGIN NOT SUCCESSFUL!!!");
//		}
		
		/*
		 * 1. both username and password are correct
		 * 2.both username and password are wrong
		 * 3.username is correct but password is wrong
		 * 4.username is wrong but password is correct
		 */
		String username="abcd";
		String password="secret";
		if(username.equals("abcd") && password.equals("secret") ) {
			System.out.println("LOGIN SUCCESSFUL");
		}else if(!username.equals("abcd") && !password.equals("secret") ) {
	//	if(username.equals("abcd")==false && password.equals("secret")==false ) {
			System.out.println("Both username and password are wrong");
		}else if(username.equals("abcd") && !password.equals("secret")){
			System.out.println("Username is correct but password is wrong");
		}else if(!username.equals("abcs") && password.equals("secret")) {
			System.out.println("Username is wrong but password is correct");
		}
		
	}

}
