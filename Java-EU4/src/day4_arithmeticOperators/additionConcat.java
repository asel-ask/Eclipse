package day4_arithmeticOperators;

public class additionConcat {

	public static void main(String[] args) {
		
		
		//Number+Number = Addition
		
		System.out.println(2+2);
		System.out.println(20+200);
		
		//Number+ String = Concatenation
		System.out.println(5+"hello");  //5hello
		
		//String+Number= Concatenation
		System.out.println("hello"+6+5+7); //hello657
		
		//String + Boolean= Concatenation 
		System.out.println("hello"+ true); //hellotrue
		
		//String +String=Concatenation
		System.out.println("hello"+"world"); //helloworld
		
		//Boolean+ Number
		//System.out.println(true+1);    //will give an error 
		
		
		System.out.println((2+0+3+"Cybertek")); //5Cybertek
		System.out.println("Cybertek"+2+0+5);   //Cybertek205 String+Number=exact numbers
		System.out.println(2+0+5+"Cybertek"+2+0+5);//7Cybertek205
		System.out.println(2+0+5+"Cybertek"+(2+0+1)); //7Cybertek3
		
		
		int x=3;
		int y=++x*5/x--+--x;
		System.out.println(y);
		
	}

}
