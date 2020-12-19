package a_reviiew.Week3;

public class SwitchWithString {

	public static void main(String[] args) {


		//String Equality
		
//		String str1="Adam";
//		String str2="Adam";
//		
//		//we use equal method
//		
//		boolean isSame= str1.equals(str2);
//		System.out.println(isSame);
		
//		String season="Summer";
//		
//		if (season.equals("Spring")) {
//			System.out.println("picnic");
//		}else if (season.equals("Summer")) {
//			System.out.println("Swimming");
//		}else if (season.equals("Fall")) {
//			System.out.println("Hiking");
//		}else if (season.equals("Winter")) {
//			System.out.println("Skiing");
//		}else {
//			System.out.println("Invalid Season!");
//		}
		
		String season="Summer";
		switch(season) {
		
		case "Spring":
			System.out.println("picnic");
			break;
		case "Summer":
			System.out.println("Swimming");
			break;
		case "Fall":
			System.out.println("Hiking");
			break;
		case "Winter":
			System.out.println("Skiing");
			break;
				
		}
		

	}

}
