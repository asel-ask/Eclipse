package day36_staticClassMembers;

public class PassAStaticMethods {

	static String name="Apple";
	int age=10;
	
	public static void show1() {
		//show2(); // u cant call instance method/variable from static method
		show4(); // u can call static method from static method
		System.out.println(name);
	//	System.out.println(age);
	}
	public  void show2() {
		show1(); //u can call static from instance method
		System.out.println(name);
		System.out.println(age);
	}
		
	public  void show3() {
		show2();
		show1();
	}
	public static void show4() {
		
	}
}
