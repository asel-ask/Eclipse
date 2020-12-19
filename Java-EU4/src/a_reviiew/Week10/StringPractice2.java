package a_reviiew.Week10;

public class StringPractice2 {

	public static void main(String[] args) {
	 
			String str="Madam";
			
			String reversedStr=""; // "ketrebyC"

			for(int i=str.length()-1;i>=0;i--) {
			reversedStr += str.charAt(i);
				  
			}
			
			 System.out.println(reversedStr);
			 
			 boolean isPalidrome=str.equalsIgnoreCase(reversedStr);
			 
			 System.out.println(isPalidrome);
			 
	}

}
