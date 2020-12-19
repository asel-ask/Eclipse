package day13_methods_part1;

public class Task65_GradesCalculator {

	public static void main(String[] args) {

		gradeCalculator(70, 70, 70);

	}
	public static void gradeCalculator(int num1,int num2, int num3) {
		int grade=(num1+num2+num3)/3;
		if (grade>=90 && grade <=100) {
			System.out.println("A");
		}else if (grade>=80 && grade<=89) {
			System.out.println("B");
		}else if (grade>=70 && grade<=79) {
			System.out.println("C");
		}else if (grade>=60 && grade<=69) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
