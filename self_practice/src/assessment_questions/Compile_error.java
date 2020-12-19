package assessment_questions;

public class Compile_error {

	public static void main(String[] args) {
		
		//widening
		//narrowing


		int i=100;
		float f=200f;
		double d=300L;
		i=(int)d; //narrowing
		d=f;      //widening
		f=i;      //widening
		i=(int)f; //narrowing
		d=i;      //widening
		f=(float)d; //narrowing
		
		
		
		float a=10L;
		double b=10L;
		long l=10l;
		double b1=20;
		int i1=(int) 10.5;     //it will give an error---> int i1=10.5;
		double b2=10F;
		int i2=10;
		short s=(short) 5L;    //it will give an error without casting ----> short s=5L;
		
		
		
		


		
	}

}
