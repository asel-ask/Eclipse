package a_reviiew.Week3;
import java.util.Scanner;
public class SeasonCodeWithScanner {

	public static void main(String[] args) {
		
		
	    Scanner sc=new Scanner(System.in);
	    System.out.println("What is the season");	
	    
//		int seasonCode=sc.nextInt();
//		 
//		
//		switch (seasonCode) {
//		
//		case 1: 
//			System.out.println("Sprint");
//			break;
//		case 2:
//			System.out.println("Summer");
//			break;
//		case 3:
//			System.out.println("Fall");
//			break;
//		case 4: 
//			System.out.println("Winter");
//		    break;
//		    default:
//		    	System.out.println("INVALID ENTRY");
//		    	break;
//		}
	    
	    String season=sc.next();
		switch(season) {
		
		case "Spring":
			System.out.println("picnic");
			break;
		case "Summer":
			System.out.println("Swimming");
			break;
		case "Fall": case "Autumn":
			System.out.println("Hiking");
			break;
		case "Winter":
			System.out.println("Skiing");
			break;
			default: 
				System.out.println("Keep coding");
				}
	}
}

