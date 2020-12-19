package assessment_questions;

public class WhileLoop {

	public static void main(String[] args) {


		int x=20;
		while(x>0) {
			do {
				x-=2;
			}while(x>5);
		}x--;
		System.out.println(x);
		
		
		
		label1: for(int i=0;i<10;i++) {
			for (int j=0;j<10;j++) {
				if (i+j-1>10) {
					break label1;
				}
			} System.out.println("hello");
		}
	}

}
