package day44_oop_review.shapes;

import java.util.List;

public class ShapeManager {

	public static Shape buildShape(String type) {
		Shape shape=null;
		switch(type.toLowerCase()) {
		case "shape":
			shape=new Shape();
			break;
		case "triangle":
			shape=new Triangle();
			break;
		case "square":
			shape=new Square();
			break;
		case "diamond":
			shape=new Diamond();
			break;
		}
		return shape;
	}
	
	public static void drawSquare(Square squarebject) {
		squarebject.draw();
	}
	
	public static void drawShape(Shape shape) {
		shape.draw();
	}
	
	public static void drawShape(List <Shape> shapeList) {
		for(Shape each : shapeList) {
			each.draw();
		}
	}
	
	
	
	
	
	
	
}
