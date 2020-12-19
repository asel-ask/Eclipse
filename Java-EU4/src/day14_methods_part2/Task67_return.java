package day14_methods_part2;

public class Task67_return {

//Write a method that accepts 2 numbers and return if they have the same last digit.	
	
	public static void main(String[] args) {


		if(LastDigits(3, 113 )) {
			System.out.println(true);
		}else 
			System.out.println(false);
	}
	
	public static boolean LastDigits(int num1, int num2 ) {
		if((num1%10)==(num2%10)) {
			return true;
		}else 
			return false;
		//return (num1%10==num2%10);
	}
}
