package a_reviiew.Week13;

public class Shape {

	protected String name;
	protected double area,perimeter;
	
	protected double calculateArea() {
		return 0;
	}
	protected double CalculatePerimeter() {
		return 0;
	}
	@Override
	public String toString() {
		return "InheritancePractice [name=" + name + ", area=" + area + ", perimeter=" + perimeter + "]";
	}
	
}
