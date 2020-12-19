package a_reviiew.Week3;
import java.util.Scanner;
public class ScannerLogin {

	public static void main(String[] args) {
		
		System.out.println("Please enter your username and password");
		Scanner input=new Scanner(System.in);
		String username=input.next();
		String password=input.next();
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
