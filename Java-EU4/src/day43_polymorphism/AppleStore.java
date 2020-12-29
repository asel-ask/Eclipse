package day43_polymorphism;

public class AppleStore {

	public static void main(String[] args) {
		
		AppleDevice mac=new Mac();
		mac.use();
		//mac.code();  ERROR
		
		Mac myMac=new Mac();
		myMac.use();
		myMac.code();
		
		AppleDevice applewatch=new AppleWatch();
		applewatch.use();
	}

}
