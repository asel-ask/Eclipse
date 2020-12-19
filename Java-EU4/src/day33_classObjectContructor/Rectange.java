package day33_classObjectContructor;

public class Rectange {

	
	double length;
	double width;
	
	public void getArea() {
		System.out.println(length*width);
	}
	
	//created a constructor
	//accepts 2 arguments type double
	public Rectange(double a,double b) {
		length=a;
		width=b;
	}
	
	public Rectange() {
		length=5.4;
		width=2.7;
	}
	
	public Rectange(int a, float b) {
		
	}
	
	
}
