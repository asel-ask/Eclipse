package QuizPractice;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle r1=new Rectangle(10,15);
		Rectangle r2=new Rectangle(r1);
		Rectangle r3=r2;
		
		
		System.out.println(r1);
		System.out.println("--------------");
		System.out.println(r2);
		System.out.println("--------------");
		System.out.println(r3);
		

	}

}
