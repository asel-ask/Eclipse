package day30_wrapperClass;

public class Task97_ReturnString {

	public static void main(String[] args) {

		String s="(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";
		System.out.println(returnStr(s));

	}
	public static String returnStr(String str) {
	
		String dummy="";
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i)) || str.charAt(i) ==' ') {
				dummy+=str.charAt(i);
			}
		}
		return dummy;
	}
}
