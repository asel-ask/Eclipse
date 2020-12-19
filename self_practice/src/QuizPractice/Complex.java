package QuizPractice;

public class Complex {

	double re,im;
	
	public Complex(double re,double im) {
		this.re=re;
		this.im=im;
	}
	
	public Complex(Complex c){
		System.out.println("Copy constructor called");
		re=c.re;
		im=	c.im;
	}
	
	public String toString() {
		return "("+re+" + "+im+"i)";
	}
	

}
