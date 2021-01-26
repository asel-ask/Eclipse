package univer;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EulerMethod {
	
	public static void main(String[] args) {
			DecimalFormat df = new DecimalFormat("#.0000");
			Scanner sc=new Scanner(System.in);
			
		 	System.out.print("Укажите a: ");
		 	double a = sc.nextDouble();
		 	System.out.print("Укажите b: ");
	        double b = sc.nextDouble();  
	        System.out.print("Укажите шаг: ");
		 	double h = sc.nextDouble(); 
		 	System.out.print("Укажите t: ");
		 	double t = sc.nextDouble(); 
	        double x=a;
	        double y=b;
	        double k;
	        //System.out.println("  x      y");
	        while(x<=t) {
	        	 k=h*func(x,y);
	             y=y+k;
	             x=x+h;
	             System.out.println(df.format(func(x, y)));
	            // System.out.println(df.format(x)+" "+df.format(y));
	        }
	}
	// x^2-2y
	public static double func(double x,double y) {
		double f=(x*x)-(2*y);
		return f;
	}
	
}
