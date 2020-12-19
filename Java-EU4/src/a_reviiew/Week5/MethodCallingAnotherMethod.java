package a_reviiew.Week5;

public class MethodCallingAnotherMethod {

	public static void main(String[] args) {
		
		wakeUp();
		
		prepareTheKids();
		

	}
	
	public static void prepareTheKids() {
		
		System.out.println("Prepare the kids method start");
		makeBreakfast();
		feedTheKid();
		dropTheKid();
		
		
		System.out.println("Prepare the kids method end");
		
		
	}

	public static void wakeUp() {
		System.out.println("open one eye");
		System.out.println("close and back to sleep");
		System.out.println("throw the alarm and wake up and drink cofee");
	}
	
	public static void makeBreakfast() {
		System.out.println("make a turkish tea or cofee");
		System.out.println("cereal, egg, milk, toast");
	}
	
	public static void feedTheKid() {
		System.out.println("feed kids with love and good food");
	 
	}
	public static void dropTheKid() {
		System.out.println("pop up in the car drop off the kids");
	 
	}
}
