package day40_accessmodifier_final_hiding;

public class MethodHidingTest {

	public static void main(String[] args) {

		

	}

}

class Bear{
	public static void eat() {
		System.out.println("Bear is eating");
	}
	
	public static void sneeze() {
		System.out.println("Bear is sneezing");
	}
	
	public void hibernate() {
		System.out.println("Bear is hibernating");
	}
}

class Panda extends Bear{
	
	//HIDING
	public static void eat() {
		System.out.println("Panda is eating");
	}
	/* COMPILER RUN ERROR
	public void sneeze() {
		System.out.println("Panda is sneezing");
	}
	*/
	
	@Override
	public void hibernate() {
		System.out.println("Panda is hibernating");
	}
	
}

