package day22_stringManipulation_4;

public class String_StartsEndWith {

	public static void main(String[] args) {

		String word1="eclipse";
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("ex"));
		
		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("ipse"));
		System.out.println(word1.endsWith("ce"));
		
		String str="Mr.Smith";
		
		if(str.startsWith("Mr.")) {
			System.out.println("Married man");
		}else if(str.startsWith("Mrs.")) {
			System.out.println("Married woman");
		}else if(str.startsWith("Ms.")) {
			System.out.println("Some woman");
		}else if(str.startsWith("Dr.")) {
			System.out.println("Doctor man or woman");
		}else
			System.out.println("Unknown status");
	}

}
