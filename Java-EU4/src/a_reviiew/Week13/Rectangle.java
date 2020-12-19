package a_reviiew.Week13;

public class Rectangle extends Shape{

	public double length,width;
	
	

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		name="Rectangle";
		area=calculateArea();
		perimeter=CalculatePerimeter();
	}

	@Override
	public double calculateArea() {
		return length*width;
	}

	@Override
	public double CalculatePerimeter() {
		return 2*(width+length);
	}
	
	
}
