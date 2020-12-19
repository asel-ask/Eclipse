package assessment_questions;

public class Increment_Decrement {
	
	public static void main(String[] args) {
		
//		
//		double a =200;
//		double b= a/2.0 + a++ + a--*5; 
//		System.out.println(b);
//		System.out.println(a);
//		System.out.println("*********************");
//		
		int a=10,b=10;
		
		for(int i=0;i<5;i++) {
			if(++a>2||++b>2) {
				a++;
			}
		}
		System.out.println("a="+a+" b="+b);
	}

}
