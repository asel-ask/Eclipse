package day13_methods_part1;

public class DeepAndDeeper {

	public static void main(String[] args) {
		
		System.out.println("I am starting in main ");
		deep();
		System.out.println("Now i am back in main");
		

	}
	public static void deep() {
		System.out.println("I am in deep");
		deeper();
		System.out.println("Now i am back in deep");
	}
	public static void deeper() {
		System.out.println("Now i am in deeper");
		
	}
}
