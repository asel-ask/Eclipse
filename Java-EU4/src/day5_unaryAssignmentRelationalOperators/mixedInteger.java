package day5_unaryAssignmentRelationalOperators;

public class mixedInteger {

	public static void main(String[] args) {

		int i1=5;
		int i2=10;
		float f1=15.5f;
		double d1=20.5;
		
		int res1=i1+i2;
		float res2=i1+f1;
		double res3=i2+d1;
		
		short firstNumber=10;
		short secondNumber=20;
		
		int thirdNumber=firstNumber+secondNumber;
		System.out.println(thirdNumber);
		
		short thirdNumber2=(short)(firstNumber+secondNumber);
		System.out.println(thirdNumber2);
		
		//byte b1=20;
		//byte b2=2;
		//int b3=b1*b2;
		//byte b3_2=(byte)(b1*b2);
		
		int b1=126;
		int b2=1;
		
		byte res=(byte)(b1+b2); //casting required
		System.out.println(res);
		
		byte res4=126+1; //no casting is required
		 System.out.println(res4);
		
		
	}

}
