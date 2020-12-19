package a_reviiew.Week12;

public class Circle {

	
	public final static double PI=Math.PI;
	private double radius,diameter,area,perimeter;
	
	public Circle(double radius) {
		this.radius=radius;
		diameter=radius*2;
		area=calculateArea();
		perimeter=calculatePerimeter();
	}
	public double calculateArea() {
		return radius*radius*PI;
	}
	
	public double calculatePerimeter() {
		return diameter*PI;
	}
	

	public double getRadius() {
		return radius;
	}
	public double getDiameter() {
		return diameter;
	}
	public double getArea() {
		return area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	
	
	public String toString() {
		return "Circle [radius=" + radius + ", diameter=" + diameter + ", area=" + area + 
				", perimeter=" + perimeter+ "]";
	}
	
	
}
