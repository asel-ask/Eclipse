package day13_methods_part1;

public class Task64_CreatePattern {

	public static void main(String[] args) {

			pattern(5);

	}
	public static void pattern(int num) {
		for(int i=1;i<=num;i++) {
			for (int k=0;k<i;k++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}
}
