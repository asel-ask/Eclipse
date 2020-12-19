package a_reviiew.Week6;

public class StringInMemory {

	public static void main(String[] args) {
		 
		String s1="abc";		//"abc" is String literal
		String s3="abc";
		
		System.out.println(s1==s3);
		
		String s2=new String("abc");  //using new keyword
		System.out.println(s1==s2);//this is checking whether s1 and s2 has same address
								// to same object
		
		System.out.println(s1.equals(s2));
		// this one is checking whether string s1 and s2 pointing has same content!!!
	}

}
