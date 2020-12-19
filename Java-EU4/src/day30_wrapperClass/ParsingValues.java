package day30_wrapperClass;

public class ParsingValues {

	public static void main(String[] args) {

		String numberAsString="2018";
		System.out.println(numberAsString);
		
		int number=Integer.parseInt(numberAsString);
		System.out.println(number);
		
		numberAsString+=1;
		number+=1;
		
		System.out.println(numberAsString);	// String
		System.out.println(number);			// int 
		
		double number2=Double.parseDouble(numberAsString);
		System.out.println(number2);
		
		int i=10;
		String s=String.valueOf(i);
		System.out.println(s);  //it will return "10"
		
		String s2=Integer.toString(i);
		System.out.println(s2);  //it will return "10"
		
		
	}

}
