package a_reviiew.Week1;

public class VariablePractice {

	public static void main(String[] args) {
		// use lower case for package name
		//use first letter upper case for ur classname
		//if u have more than one word in ur classname
		//just like in this class VariablePractice
		
		//declaring variable-- creating variable
		
		// DataType variable name;
		//easy way to remember 8 primitive type by below sentence
		// be careful, Bear Shouldnt Injest Large fluffy dog
		//boolean, char, byte, short, int, long, float, double
		
		
		byte score; //declaring variable, creating variable
			score=100; //initializing variable,assigning a value, giving first value
			score=101; //re-assigning a value, changing the existing value 
			
			
		short s1=4000; //declaring and initializing the value in on line
		
		int num=100000000;
		int num2=100_000_000; //under score can be used to make it more readable
		
		long count=99_999_999_999l; //l or L to indicate this is long value
		
		
		
		float radius=3.14f; //put F or f to indicate this is a float variable
		
		double pi=3.1455515544d; // add D or d to make it obvious that this is double
		
		
		boolean lightOn=true; //it can be only true or false
		
		char letter='A'; // it must be single quote and single character
		char LetterWithNumber=65; 
		
		
		System.out.println(score);
		System.out.println(s1);
		System.out.println(num);
		System.out.println(num2);
		System.out.println(count);
		System.out.println(radius);
		System.out.println(pi);
		System.out.println(lightOn);
		System.out.println(letter);
		System.out.println(LetterWithNumber);
		
		
	}

}
