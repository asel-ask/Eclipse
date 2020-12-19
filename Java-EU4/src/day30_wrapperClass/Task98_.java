package day30_wrapperClass;

public class Task98_ {

	public static void main(String[] args) {
		 
		 String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
	       System.out.println(decodeTheCode(str1));		//1 2 5 6 
	        
	     String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";
	       System.out.println(decodeTheCode(str2));		//9 3 4

	}
	public static String decodeTheCode(String str) {
		
		String dummy="";
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i)) || str.charAt(i)==' ') {
				dummy+=str.charAt(i);
			}
	}
		String [] arr=dummy.split(" ");
		String dummy2="";
		for(String value : arr) {
			
			dummy2=dummy2+getDigit(value)+" ";
		}
		return dummy2.trim();
	}
	public static String getDigit(String st) {

		switch(st.toUpperCase()) {
		
		case "ZERO":
			return "0";
		case "ONE":
			return "1";
		case "TWO":
			return "2";
		case "THREE":
			return "3";
		case "FOUR":
			return "4";
		case "FIVE":
			return "5";
		case "SIX":
			return "6";
		case "SEVEN":
			return "7";
		case "EIGTH":
			return "8";
		case "NINE":
			return "9";
		default: 
			return "";
		}
		
	}
	
	
}
