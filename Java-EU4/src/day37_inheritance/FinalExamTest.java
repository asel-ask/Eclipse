package day37_inheritance;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of questions: ");
		int questions=sc.nextInt();
		System.out.print("How many did the student missed: ");
		int missed=sc.nextInt();
		FinalExam exam=new FinalExam(questions,missed);
		System.out.println("The grade for the exam is : "+exam.getGrade());
		
		
		
	}
}
