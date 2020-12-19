package QuizPractice;

public class Point {

	int l,k;
	
	Point(int x,int y) {
		l=x;
		k=y;
	}
	
	Point(){
		this(10,5);
	}
	
	public int getX() {
		return l;
	}
	
	public int getY() {
		return k;
	}
	
	public static void main(String[] args) {
		Point p=new Point();
		System.out.println(p.getY());
	}
}
