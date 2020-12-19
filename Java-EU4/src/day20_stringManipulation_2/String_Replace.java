package day20_stringManipulation_2;

public class String_Replace {

	public static void main(String[] args) {

		String str="Moscow is a capital of Russia1";
		
		str=str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan");
		System.out.println(str);
		
		String email="firstName_LastName@gmail.com";
		String company="capitanone";
		String newEmail=email.replace("gmail", "capitalone");
		System.out.println(newEmail);
		System.out.println(email);
	}

}
