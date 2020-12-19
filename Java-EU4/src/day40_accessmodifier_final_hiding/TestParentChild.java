package day40_accessmodifier_final_hiding;

public class TestParentChild {

	public static void main(String[] args) {
		
		Chlid s=new Chlid();
		System.out.println("Value of x before increement "+s.x);
		
		s.increment();
		
		System.out.println("Value of x after increement "+s.x);
		
		Parent p=new Parent();
		System.out.println("Value of x before increement "+p.x);
		
		p.increment();
		
		System.out.println("Value of x after increement "+p.x);
	}
}
