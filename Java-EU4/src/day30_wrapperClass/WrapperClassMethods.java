package day30_wrapperClass;

public class WrapperClassMethods {

	public static void main(String[] args) {

		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		
		System.out.println(Character.isAlphabetic('a'));
		System.out.println(Character.isAlphabetic('1'));
		
		System.out.println(Character.isDigit('5'));
		System.out.println(Character.isDigit('t'));
		
		String str="java0045";
		System.out.println(Character.isAlphabetic(str.charAt(2)));
		
		
	}

}
