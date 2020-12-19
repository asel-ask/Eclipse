package a_reviiew.Week13;

public class Triangle extends Shape {

	double base,height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
		name="Triangle";
		area=calculateArea();
		perimeter=CalculatePerimeter();
	}

	@Override
	protected double calculateArea() {
		return 0.5*base*height;
	}

	@Override
	protected double CalculatePerimeter() {
		return base+height;
	}
	
	
	
}
