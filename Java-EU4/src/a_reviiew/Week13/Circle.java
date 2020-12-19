package a_reviiew.Week13;

public class Circle extends Shape {

	double radius,diameter;
	public static final double PI;
	
	static {
		PI=Math.PI;
	}
	
	public Circle(double radius) {
		this.radius = radius;
		diameter=2*radius;
		name="Circle";
		area=calculateArea();
		perimeter=CalculatePerimeter();
	}

	@Override
	protected double calculateArea() {
		return radius*radius*PI;
	}

	@Override
	protected double CalculatePerimeter() {
		return diameter*PI;
	}
	
	
	
	
}
