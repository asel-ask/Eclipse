package a_reviiew.Week6;

public class StringMethodPractice {

	public static void main(String[] args) {

		String message = "Java is Awesome!!";
		int count=message.length();
		System.out.println(count);
		System.out.println(message.length());
		
		message=message.toUpperCase();
		System.out.println(message);
		
		String str="abc ";
		System.out.println("str has character count "+str.length());
		
		System.out.println("is <abc > equal <abc>"+str.equals("abc"));
		
		String str2=str.trim();
		System.out.println("the result after trimming "+str2.equals("abc"));
		
		System.out.println("check str2 is ABC caseInsensetive "
				+ str2.equalsIgnoreCase("ABC"));
		
		System.out.println("Does str contains letter a : "+str.contains("a"));
		
		System.out.println("Does str contains letter A : "+str.contains("A"));
		
		System.out.println("Does str contains letter A or a case insensetive : "
				+str.toUpperCase().contains("A"));
		
		 
		
			//	   01234 --> index
		String s1="Hello";
			//     12345 --> length
		
		System.out.println("first character : "+s1.charAt(0));
		//find last character: index of last character is always 1 less that charachter count
		
		int lastIndex=s1.length()-1;
		System.out.println("index of the last character is "+lastIndex);
		
		System.out.println("Last character is : "+s1.charAt(lastIndex));
		
		System.out.println("check whether s1 is emppty : "+s1.isEmpty());
		
		String s2="";
		System.out.println("check whether s2 is empty : "+s2.isEmpty());
		
		//indexOf
		
		String s4="EU4 is Awesome!";
		
		System.out.println("Position of A is "+s4.indexOf("A"));
		System.out.println("Position of A is "+s4.indexOf('A'));
		System.out.println("Position of Z is "+s4.indexOf("Z"));
		System.out.println("Position of som is "+s4.indexOf("som"));
		
		//EU4 is Awesome!
		System.out.println("characters between index 2 and right before index 9 | "
				+s4.substring(7,9));
		System.out.println("characters between index 2 and right before index 9 | "
				+s4.substring(1,8));
		
		System.out.println("Get character starting from index 4 till the last one |"
				+s4.substring(4));
		
	}

}
