package day9_ControlFlowStaements_3;
import java.util.Scanner;
public class Scanner_Task4SalaryWage {

	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
		
		double wageHourly=scan.nextDouble();
		double hour=2080;
		double 	salaryAnnual=wageHourly*hour;
		System.out.println("Your annual salary is "+salaryAnnual);
	}

}
