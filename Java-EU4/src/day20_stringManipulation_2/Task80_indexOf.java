package day20_stringManipulation_2;

public class Task80_indexOf {

	public static void main(String[] args) {
		

		checkedString("Your order confirmation is XYZ", "confirmation");
	}
		public static void checkedString(String str1, String str2) {
			
			if(str1.contains(str2)) {
				System.out.println(str1.indexOf(str2));
				
			}else 
				System.out.println("Not found");
		}
}
