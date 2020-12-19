package day40_accessmodifier_final_hiding;

public class FinalMethods {

	public final void method1() {
		System.out.println("Method-1");
	}
	
	public static final void staticMethod(String word) {
		System.out.println("Static Method");
	}
}

class Sub extends FinalMethods{
	
	/**
	public void method1() {
		System.out.println("Method-1 in sub class");
	}
	
	public static void staticMethod(String word) {
		System.out.println("Static Method in sub class");
	}
	*/
	
	
}