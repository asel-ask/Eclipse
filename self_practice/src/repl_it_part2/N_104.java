package repl_it_part2;
import java.util.Scanner;
public class N_104 {

	public static void main(String[] args) {
		 

		 
		    Scanner scan = new Scanner(System.in);
				String json = scan.nextLine();
				int firstName=json.indexOf("firstName")+13;
				 int firstNameEnd=json.indexOf("\"", firstName);
				 int lastName=json.indexOf("lastName")+12;
				 int lastNameEnd=json.indexOf("\"", lastName);
				 System.out.println("First name: "+json.substring(firstName,firstNameEnd));
				 System.out.println("Last name: "+json.substring(lastName,lastNameEnd));
		  }

}
