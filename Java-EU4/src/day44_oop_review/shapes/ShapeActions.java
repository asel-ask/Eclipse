package day44_oop_review.shapes;
import static day44_oop_review.shapes.ShapeManager.*;
public class ShapeActions {

	public static void main(String[] args) {
		
		
		Square mySquare=new Square();
		
		drawShape(mySquare);
		
		drawSquare((Square)buildShape("square"));
		
		
	}

}
