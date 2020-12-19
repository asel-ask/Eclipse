package a_reviiew.Week13;

public class Square extends Shape {
	
	public double side;

	public Square(double side) {
		this.side = side;
		name="Square";
		area=calculateArea();
		perimeter=CalculatePerimeter();
	}

	@Override
	protected double calculateArea() {
		return side*side;
	}

	@Override
	protected double CalculatePerimeter() {
		return 4*side;
	}
	
	
	
	
}
