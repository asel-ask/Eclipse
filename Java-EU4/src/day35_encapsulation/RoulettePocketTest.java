package day35_encapsulation;
import java.util.Scanner;
public class RoulettePocketTest {
	public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a pocket number: ");
		
		RoulettePocket r=new RoulettePocket(sc.nextInt());
		
		while(r.getPocketColor().equalsIgnoreCase("invalid")) {
			System.out.print("Enter a pocket number: ");
			r.setPocketNumber(sc.nextInt());
		}
		
		System.out.println(r.getPocketColor());

	}

}
