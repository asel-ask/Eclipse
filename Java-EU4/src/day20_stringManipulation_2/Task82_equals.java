package day20_stringManipulation_2;

import java.util.Scanner;

public class Task82_equals {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		 
		System.out.print("Enter username: ");
		String usernameInput=sc.nextLine();
		System.out.print("Enter  password: ");
		String passwordInput=sc.nextLine();
		String username="user123";
		String password="cyber741";
		
		if(usernameInput.equals("") && passwordInput.equals("")) {
			System.out.println("UserNameand Password Fields cannot be empty");
		}else if(usernameInput.equals("") && !passwordInput.equals("")) {
			System.out.println("UserName cannot be empty");
		}else if(!usernameInput.equals("") && passwordInput.equals("")) {
			System.out.println("Password cannot be empty");
		}else if(!usernameInput.equals(username) || !passwordInput.equals(password)) {
			System.out.println("UserNameor password is not valid. Please verify");
		}else if(usernameInput.equals(username) && passwordInput.equals(password)) 
			System.out.println("User Logged in successfully");
		
		
		
		
		
}
}
