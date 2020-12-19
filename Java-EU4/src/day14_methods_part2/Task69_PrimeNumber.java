package day14_methods_part2;

public class Task69_PrimeNumber {
	/*A prime number is a number that is evenly divisible only by itself and 1.
	 *  For example, the number 5 is prime number because it can be evenly divided only by 1 and 5. 
	 *  The number 6, however, is not prime number because it can be divided evenly by 1,2,3,and 6.
	 *  Write a method named isPrime which takes an integer as an argument and returns true 
	 *  if the argument is a prime number, or false otherwise.•Note: 0 and 1 are not prime numbers. 
	 *  The 2 is the only even prime number because all the other even numbers can be divided by 2.
	 */
	public static void main(String[] args) {
		
		int x=5;
		if(isPrime(x)){
			System.out.println("1 is not a prime number");
		}else 
			System.out.println("1 is not a prime number");
		isPrime(5);
		isPrime(6);
		isPrime(2);

	}
//	public static int isPrime (int num) {
//		int x=0,y=0;
//		x=num/2;
//		if(num==0 || num==1) {
//			System.out.println(num+" Is not a prime number");
//		}else {
//			for(int i=2;i<x;i++) {
//				if(num%i==0) {
//					System.out.println(num+" Is not a prime number");
//					y=1;
//					break;
//				}
//			}
//			if(y==0) {
//				System.out.println(num+" Is a prime number");
//			}
//		}
//		 return y;
	public static boolean isPrime (int num) {
		boolean flag=true;
		if(num==0 || num==1) {
			flag=false;
		}else {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					flag=false;
					break;
				}
			}
		}
		return flag;
		
	}
}
