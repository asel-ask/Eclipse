package day44_oop_review.shapes;

public class ShapeTest {

	public static void main(String[] args) {
		
		Object shapeObj=new Shape();
		Shape diamond=new Diamond();
		Shape triangle=new Triangle();
		Shape square=new Square();
		
		square.draw();
		triangle.draw();
		
		((Square)square).squareMethod();
	}

}
