package assignments.day_8;

public class Question7 {

	public static void main(String[] args) {
	 
		System.out.println(isPalindrome(505)); 
		
	}

	public static boolean isPalindrome(int num ) {
		
		int reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;

       
        while(num!= 0)
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num /= 10;
        }

       
        if (originalInteger == reversedInteger)
           return true;
        else
            return false;
    }
}
