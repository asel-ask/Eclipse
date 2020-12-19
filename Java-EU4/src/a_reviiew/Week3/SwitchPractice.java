package a_reviiew.Week3;

public class SwitchPractice {

	public static void main(String[] args) {


		int seasonCode=3;
		
		switch (seasonCode) {
		
		case 1: 
			System.out.println("Sprint");
			break;
		case 2:
			System.out.println("Summer");
			break;
		case 3:
			System.out.println("Fall");
			break;
		case 4: 
			System.out.println("Winter");
		    break;
		    default:
		    	System.out.println("INVALID ENTRY");
		    	break;
		}
		
	/*	if(seasonCode==1) {
			System.out.println("Sprint");
		}else if (seasonCode==2) {
			System.out.println("Summer");
		}else if(seasonCode==3) {
			System.out.println("Fall");
		}else if (seasonCode==4) {
			System.out.println("Winter");
		}else {
			System.out.println("INVALID ENTRY!!!");
		}*/
		
				
				

	}

}
