package univer;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
		Scanner sc=new Scanner(System.in);
		System.out.print("Введите а: ");
		double a=sc.nextDouble();
		System.out.print("Введите b: ");
		double b=sc.nextDouble();
		System.out.print("Введите c: ");
		double c=sc.nextDouble();
		double d=(b*b)-(4*a*c);
		System.out.println("Дискриминант: "+d);
		if(d<0) {
			System.out.println("Корней нет");
		}else if(d==0) {
			double x=-b/(2*a);
		}else {
			double x1=(-b-Math.sqrt(d))/(2*a);
			double x2=(-b+Math.sqrt(d))/(2*a);
			System.out.println("Korni :"+df.format(x1)+" "+df.format(x2));
			if(x1>x2) {
				System.out.println("Наибольший корень: "+df.format(x1));
			}else {
				System.out.println("Наибольший корень: "+df.format(x2));
			}
		}
		
		
		
		
		
	}
}
