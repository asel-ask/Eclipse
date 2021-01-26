package univer;

public class main {

	public static double h=0.2;
	public static void main(String[] args) {
		double a=2,b=5;
		double n=(b-a)/h;
		System.out.println("Трапеция = "+trapeze(a, b, n));
		System.out.println("Cимпсон = "+symson(a, b, n));
	}
	public static double trapeze(double a,double b, double n) {
		double sum=f(a)+f(b);
		for(int i=0;i<n;i++) {
			sum += 2*f(a+i*h);
		}
		sum *= h/2;
		return sum;
	}
	public static double symson(double a,double b, double n) {
		double sum=f(a)+f(b);
		int k;
		for(int i=0;i<n;i++) {
			k=2+2*(i % 2);
			sum += k * f (a+i*h);
		}
		sum *= h/3;
		return sum;
	}
	public static double f(double x) {
		return Math.log(x);
	}
	

	
	

}