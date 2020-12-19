package day34_constructorsPassingObjectToMethod;

public class AppleTset {

	public static void main(String[] args) {

		Apple a1=new Apple();
		
		changeApple(a1);
		
		methodObject().color="Brown"; // holds whatever we are returning from method
	}

	public static void changeApple(Apple b1) {
		
		b1.color="Yellow";
		b1.mA();
	}
	
	public static Apple methodObject() {
		Apple a1=new Apple();
		return a1;
		
	}
	
	
	
}
